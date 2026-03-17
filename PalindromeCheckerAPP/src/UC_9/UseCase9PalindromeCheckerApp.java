package UC_9;

/**
 * ================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using recursion.
 *
 * Author: Your Name
 * Version: 1.0
 */

public class UseCase9PalindromeCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Check mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
