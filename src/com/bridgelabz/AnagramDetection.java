package com.bridgelabz;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] string1;
        char[] string2;
        System.out.println("Enter the two string to compare: ");
        System.out.println("String1: ");
        string1 = scanner.next().toCharArray();
        System.out.println("String2: ");
        string2 = scanner.next().toCharArray();

        if (anagramCheck(string1, string2))
            System.out.println("Anagram");
        else {
            System.out.println("Not anagram");
        }
    }

    public static boolean anagramCheck(char[] string1, char[] string2) {
        int length1 = string1.length;
        int length2 = string2.length;

        if (length1 != length2)
            return false;
        Arrays.sort(string1);
        Arrays.sort(string2);
        for (int i = 0; i < length1; i++) {
            if (string1[i] != string2[i])
                return false;
        }
        return true;
    }

}
