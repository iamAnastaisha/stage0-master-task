package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String num = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(Character.toString(num.charAt(i)));
        }
        System.out.println(sum);
    }

}
