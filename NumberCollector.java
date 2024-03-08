package Lab2Part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberCollector {

    Scanner input = new Scanner(System.in);

    public void selectInputMethod() {
        System.out.println("Please choose input method:");
        System.out.print("1 for Direct input, ");
        System.out.println("2 for Input from file");

        int choice = input.nextInt();
        if (choice == 1) {
            handleInputDirectly();
        } else if (choice == 2) {
            handleInputFromFile();
        } else {
            System.out.println("Invalid choice. Using direct input by default.");
            input = new Scanner(System.in);
        }
    }

    private void handleInputDirectly() {
        input = new Scanner(System.in);
    }

    private void handleInputFromFile() {
        System.out.println("Enter file path:");
        String filePath = input.next();
        try {
            File file = new File(filePath);
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            // Revert to default input
            input = new Scanner(System.in);
        }
    }
    // References: https://www.w3schools.com/java/java_files_create.asp , https://www.geeksforgeeks.org/java-io-filenotfoundexception-in-java/
    

    public int inputFromUser() {
        System.out.print("Please enter the number: ");
        return input.nextInt();
    }
   
   
    
}
