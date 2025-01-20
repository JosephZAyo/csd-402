/**
 *
 * @author Joseph Ayo
 * 1/19/2025
 * Project Assignment M3 - CSD 402
 * Program Function: Create a oyramid of sequentially increasing numbers, ending with an @ symbol on each line.
 */
public class Main {

  public static void main(String[] args) {
      int rows = 7; // Number of rows for the pyramid
      int k = 0, count = 0, count1 = 0;

      // Loop through each row
      for (int i = 1; i <= rows; ++i) {
          // Print spaces for centering
          for (int space = 1; space <= rows - i; ++space) {
              System.out.print("  ");
          }

          // print the first number
          System.out.print("1 ");

          // Print the increasing sequence
          int currentNumber = 1;
          for (int j = 1; j < i; j++) {
              currentNumber *= 2;
              System.out.print(currentNumber + " ");
          }

          // Print the decreasing sequence 
          currentNumber /= 2;
          for (int j = i - 2; j >= 0; j--) {
              currentNumber /= 2;
              System.out.print(currentNumber + " ");
          }

          // Print the '@' symbol at the end of each row
          System.out.print(" @");

          // Move to the next line
          System.out.println();
      }
  }
}