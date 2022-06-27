package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime Numbers is: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit ");
        int x = scanner.nextInt();
        System.out.println("Enter the upper limit ");
        int y = scanner.nextInt();
        for (int i = x; i <= y; i++){
           int count = 0;
           for (int j = 2; j <= i / 2; j++ ){
               if (i % j == 0){
                   count++;
               }
           }
           if (count == 0){
               System.out.println(i + " ");
           }
        }
    }
}
