/**
 *
 * @author Joseph Ayo
 * 2/15/2025
 * Project Assignment M8 - CSD 402
 * Program Function: Create a method capable of determining the highest value within an Array list that is populated by the user.  */
import java.util.ArrayList;
import java.util.Scanner;

public class AyoArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        // Check if the list is empty
        if (list.isEmpty()) {
            return 0; 
        }
        
        // Create max with the first element of the list
        int max = list.get(0);
        
        // Iterate through the list to find the maximum value
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to hold the integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Ask user for input
        System.out.println("Enter integers (0 to stop): ");
        
        // Continue accepting inputs until 0 is entered
        while (true) {
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }
        
        // Pass the list 
        Integer largestValue = max(numbers);
        
        // Display the largest value
        System.out.println("The largest value in the list is: " + largestValue);
        
        // Close the scanner
        scanner.close();
    }
}
