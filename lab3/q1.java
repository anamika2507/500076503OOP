package com.R177219026.Lab3;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter digit1: ");
        int digit1 = sc.nextInt();
        System.out.println("Enter digit2: ");
        int digit2 = sc.nextInt();
        System.out.println("Enter digit3: ");
        int digit3 = sc.nextInt();

        int[] digits = {digit1, digit2, digit3};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    System.out.println(digits[i] + "" + digits[j] + "" + digits[k]);
                }
            }
        }
    }
}
