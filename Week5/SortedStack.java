import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * A program to read a list of integers from the user input,
 * save them into a stack, and then sort the stack.
 */
public class SortedStack {
    /**
     * Main method to run the program.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter a list of integers, separated by spaces, and press enter when done:");
        String[] inputNumbers = input.nextLine().split(" ");

        for (String str : inputNumbers) {
            numbers.push(Integer.parseInt(str));
        }

        Collections.sort(numbers);

        // Create a temporary stack to hold the sorted elements in ascending order
        Stack<Integer> sortedStack = new Stack<>();
        while (!numbers.isEmpty()) {
            sortedStack.push(numbers.pop());
        }

        // Transfer elements from temporary stack back to the original stack
        while (!sortedStack.isEmpty()) {
            numbers.push(sortedStack.pop());
        }

        System.out.println("Sorted stack: " + numbers);
        
        input.close(); // Closing the Scanner object
    }
}
