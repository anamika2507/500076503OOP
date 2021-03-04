package com.R177219026.Lab3;

public class q4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 41; i < 250; i++){
            if(i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all integers between 41 and 250: " + sum);
    }
}
