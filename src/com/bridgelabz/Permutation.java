package com.bridgelabz;

public class Permutation {

    // Method for swapping char
    public static String swapChar(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
    // Method for generating permutation of word
    public static void generatePermutation(String string, int start, int end) {
        if (start == end - 1)
            System.out.println(string);
        else {
            for (int i = start; i < end; i++) {
                string = swapChar(string, start, i);
                generatePermutation(string, start + 1, end);
                string = swapChar(string, start, i);
            }
        }
    }

    //Main method
    public static void main(String[] args) {
        String string = "Ashu";
        int length = string.length();
        System.out.println("All the permutation of the string are: ");
        generatePermutation(string, 0, length);
    }
}
