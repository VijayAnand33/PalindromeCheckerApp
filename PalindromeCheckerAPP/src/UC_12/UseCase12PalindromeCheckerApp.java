package UC_12;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ================================================================
 * INTERFACE - PalindromeStrategy
 * ================================================================
 */

interface PalindromeStrategy {
    boolean check(String input);
}


/**
 * ================================================================
 * STRATEGY 1 - Stack Based
 * ================================================================
 */

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * ================================================================
 * STRATEGY 2 - Deque Based
 * ================================================================
 */


class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * ================================================================
 * CONTEXT CLASS
 * ================================================================
 */

class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}


/**
 * ================================================================
 * MAIN CLASS
 * ================================================================
 */


public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Choose method: 1-Stack, 2-Deque");
        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.execute(input);

        System.out.println(result ? "Palindrome" : "Not a palindrome");

        scanner.close();
    }
}
