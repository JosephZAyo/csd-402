/**
 *
 * @author Joseph Ayo
 * 2/15/2025
 * Project Assignment M9 - CSD 402
 * Program Function: Create a program to write a file containing ten randomly generated numbers. Appends if the file already exists. */
import java.io.*;
import java.util.Random;

public class FileHandler {
    public static void main(String[] args) {
        String filename = "data.file";
        Random random = new Random();

        // Write or append random numbers to the file
        try (FileWriter fw = new FileWriter(filename, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            
            for (int i = 0; i < 10; i++) {
                pw.print(random.nextInt(100) + " "); // Random number between 0-99
            }
            pw.println();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and display the file contents
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Contents of " + filename + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
