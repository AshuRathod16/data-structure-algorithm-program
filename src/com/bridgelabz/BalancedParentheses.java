package com.bridgelabz;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '{' || string.charAt(i) == '(') {
                stack.push(string.charAt(i));
            } else if (!stack.empty() && ((string.charAt(i) == '}' && stack.peek() == '{') || (string.charAt(i) == ')' && stack.peek() == '(')))
                stack.pop();
            else
                stack.push(string.charAt(i));
        }

        if (stack.empty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}


