package com.R177219026.Lab3;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int element = 0;
        int square = 0;
        int sum = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Enter element " + i + ": ");
            element = sc.nextInt();
            square = element * element;
            sum += square;
        }

        System.out.println("Squared sum of all elements is: " + sum);
    }
}
