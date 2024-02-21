import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A program to read a list of integers from the user input,
 * save them into a linked list, and then sort the list.
 */
public class SortedLinkedList {
    /**
     * Main method to run the program.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter a list of integers, separated by spaces, and press enter when done:");
        String[] inputNumbers = input.nextLine().split(" ");

        for (String str : inputNumbers) {
            numbers.add(Integer.parseInt(str));
        }

        Collections.sort(numbers);

        System.out.println("Sorted linked list: " + numbers);
        
        input.close(); // Closing the Scanner object
    }
}

