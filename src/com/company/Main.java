package com.company;

public class Main {
//changes
    public static void main(String[] args) {
        for (int myNumber = 1; myNumber <=100; myNumber++) {
            if ((myNumber % 3 == 0) && (myNumber % 5 == 0)) {
                System.out.println("fizzbuzz");
            } else if (myNumber % 5 == 0) {
                System.out.println("buzz");
            } else if (myNumber % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(myNumber);
            }

        }

    }

}


