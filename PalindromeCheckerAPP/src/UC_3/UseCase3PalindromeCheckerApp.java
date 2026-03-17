package UC_3;

/**
 * ================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by reversing it using a loop.
 *
 * Author: Your Name
 * Version: 1.0
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string (can change this to test)
        String input = "racecar";

        // Variable to store reversed string
        String reversed = "";

        // Reverse using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}