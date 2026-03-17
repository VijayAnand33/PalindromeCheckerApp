package UC_11;
import java.util.Scanner;

/**
 * ================================================================
 * CLASS - PalindromeChecker
 * ================================================================
 *
 * Description:
 * Contains logic to check whether a string is a palindrome.
 */

class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize input (ignore case & spaces)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}


/**
 * ================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ================================================================
 */

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        // Output
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        scanner.close();
    }
}