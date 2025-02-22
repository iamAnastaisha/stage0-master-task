package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[] {"Winter", "Spring", "Summer", "Autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] res = new int [length];
        for (int i = 1; i <= length; i++) {
            res[i-1] = i;
        }
        return res;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] preres = new int[arr.length];
        int count = 0;
        for (int j : arr) {
            if (j > 0) {
                preres[count] = j;
                count++;
            }
        }
        int[] res = new int[count];
        System.arraycopy(preres, 0, res, 0, count);
        return res;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int [][] newArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int minInd = findMin(arr[i], j, arr[i].length);
                int help = arr[i][j];
                arr[i][j] = arr[i][minInd];
                arr[i][minInd] = help;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int minInd = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != null && arr[j].length < min) {
                    min = arr[j].length;
                    minInd = j;
                }
            }
            newArr[i] = arr[minInd];
            arr[minInd] = null;
        }
        return newArr;
    }

    private int findMin(int[] arr, int l, int r) {
        int min = Integer.MAX_VALUE;
        int minInd = 0;
        for (int i = l; i < r; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minInd = i;
            }
        }
        return minInd;
    }
}
