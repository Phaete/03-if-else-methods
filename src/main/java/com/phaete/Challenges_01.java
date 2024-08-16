package com.phaete;

public class Challenges_01 {
    public static void main(String[] args) {
        // Add
        System.out.println("Add");
        System.out.println("1 + 2 = " + add(1, 2));
        System.out.println("0.2 + 0.3 = " + add(0.2, 0.3));
        System.out.println("1 + 0.2 = " + add(1, 0.2));
        // Subtract
        System.out.println("Subtract");
        System.out.println("a=1, b=2: " + subtract(1,2));
        System.out.println("a=2, b=1: " + subtract(2,1));
        // Make Positive
        System.out.println("Make Positive:");
        System.out.println("2: " + makePositive(2));
        System.out.println("-2: " + makePositive(-2));

        int firstNumber = 4;
        int secondNumber = 8;

        if (firstNumber > secondNumber) {
            System.out.println(subtract(firstNumber, secondNumber));
        } else {
            System.out.println(add(firstNumber, secondNumber));
        }
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static double add(double a, double b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        if (a > b) {
            return a-b;
        }
        return b-a;
    }

    public static int makePositive(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }

    public static int isEven(int a) {
        if (a % 2 == 0) {
            return a;
        }
        return 2*a;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.length()-1-i) {
                    return false;
            }
        }
        return true;
    }
    /*
    Create a conditional statement to call the 'subtract' method if the first number is greater than the second, otherwise call the 'add' method.

    Write a method that checks if a number is even. Even numbers should be returned as is, while odd numbers should be doubled.

    Write a method that takes a string as a parameter and checks if it is a palindrome (i.e., reads the same forwards and backwards). Return true if it is a palindrome, otherwise return false.
    */
}
