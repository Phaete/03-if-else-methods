package com.phaete;

public class Main {
    public static void main(String[] args) {
        //sayHello();
        System.out.println(add(1,2));
    }

    public static void sayHello() {
        // If
        System.out.println("If");
        System.out.println("--------------------------");
        boolean livingOnEarth = true;

        System.out.println("Hello");
        if (livingOnEarth) {
            System.out.println("Earth!");
        }

        // If-Else
        System.out.println("If-Else");
        System.out.println("--------------------------");
        System.out.println("Hello");
        if (livingOnEarth) {
            System.out.println("Earth!"); // livingOnEarth == true
        } else {
            System.out.println("Mars!"); // livingOnEarth == false
        }

        // Nesting
        System.out.println("Nesting");
        System.out.println("--------------------------");
        System.out.println("Hello");
        int age = 18;
        if (livingOnEarth) {
            System.out.println("Earth!"); // livingOnEarth == true
            if(age >= 18) { // Nested if
                System.out.println("Welcome to the club!");
            }
        } else {
            System.out.println("Mars!"); // livingOnEarth == false
        }
    }

    public static int add(int a, int b) {
        return a+b;
    }
}