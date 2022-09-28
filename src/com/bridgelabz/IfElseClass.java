package com.bridgelabz;

public class IfElseClass {
    public static void main(String[] args) {
        {
            int n = 7891;
            int th, h, t, o;  // Thousands,hundreds,tens,ones
            o = n % 10;
            t = (n / 10) % 10;
            h = (n / 100) % 10;
            th = n / 1000;
            System.out.println("Thousands = " + th + "\nHundreds = " + h + "\nTens = " + t + "\nOnce = " + o);
        }

    }
}
