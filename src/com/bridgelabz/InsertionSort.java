package com.bridgelabz;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Sorting the strings");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arraySize = scanner.nextInt();
        String[] stringArray = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the string");
            stringArray[i] = scanner.next();
        }
        sorting(stringArray);
    }

    public static void sorting(String[] array) {
        String temp;
        int j;

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1].compareTo(temp) > 0) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;
        }
        System.out.println("Sorted array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
