/**
 *
 * @author Joseph Ayo
 * 2/15/2025
 * Project Assignment M9 - CSD 402
 * Program Function: Create a program that uses an ArrayList filled with 10 strings. 
 * Enable the user to ask which element they would like to see again, then print using a try/catch format.  */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList with 10 string elements
        ArrayList<String> words = new ArrayList<>();
        words.add("Captain America");
        words.add("Iron Man");
        words.add("Hulk");
        words.add("Black Widow");
        words.add("Thor");
        words.add("Black Panther");
        words.add("Starlord");
        words.add("Captain Marvel");
        words.add("Scarlet Witch");
        words.add("Spiderman");
        
        // Print the list using a for-each loop
        System.out.println("Here is the list of words:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-9) to see the corresponding element: ");
        
        // Using autoboxing to convert user input (String) to Integer
        try {
            Integer index = Integer.parseInt(scanner.nextLine()); // Autoboxing from int to Integer
            String chosenWord = words.get(index); // Attempt to retrieve the word
            System.out.println("You selected: " + chosenWord);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number between 0 and 9.");
        }
        
        scanner.close();
    }
}
