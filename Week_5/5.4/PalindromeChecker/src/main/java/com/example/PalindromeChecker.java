package com.example;

public class PalindromeChecker {
    public boolean isPalindrome(String input) {
        return checkPalindrome(transformInput(input));
    }

    public String transformInput(String input) {
        return input.toLowerCase().replaceAll("[ ,!]", "");
    }

    public boolean checkPalindrome(String input) {
        return input.equals(reverseString(input)) ? true : false;
    }

    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println("PalindromeChecker");;
    }
}
