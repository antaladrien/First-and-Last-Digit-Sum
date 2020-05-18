package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = myObj.nextInt();
        System.out.println("The sum of the first and the last " +
                "digit of that number: " + sumFirstAndLastDigit(num));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int last = 0;
        last = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return number + last;
    }
}
