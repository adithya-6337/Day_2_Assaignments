package com.bridgelabz;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single digit number:");
        String[] array = {"exit/quit", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int a = scanner.nextInt();
        if (a < 10) {
            System.out.println("You have entered number : " + array[a]);
        } else {
            System.out.println("not allow");
        }
    }
}