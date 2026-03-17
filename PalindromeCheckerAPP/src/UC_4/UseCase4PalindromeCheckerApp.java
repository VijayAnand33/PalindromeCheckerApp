package UC_4;

/**
 * ================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using a character array and two-pointer technique.
 *
 * Author: Your Name
 * Version: 1.0
 */

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}
