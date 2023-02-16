package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            int k = i + 1;
            for (int j = 0; j < cathetusLength; j++) {
                if (j >= cathetusLength - i - 1) {
                    System.out.print(k);
                    k--;
                } else {
                    System.out.print(" ");
                }
            }

            if (i != 0) {
                int l = 2;
                for (int j = cathetusLength + 1; j <= 2 * cathetusLength - 1; j++) {
                    if (i > j - cathetusLength - 1) {
                        System.out.print(l);
                        l++;
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
