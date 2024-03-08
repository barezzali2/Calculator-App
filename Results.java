package Lab2Part2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Results {

    Calculation calc = new Calculation();

    public void resultsHandler(int num1, int num2) { // printing the results
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to print the results normally, or store them in a file?");
        System.out.println("Write 1 to print them, or 2 to store them");
        
        int choice = input.nextInt();
        if(choice == 1) {
            printDirectly(num1, num2);
        } else if(choice == 2) {
            String results =  calc.calculate(num1, num2);
            storeToFile(results);
        }

    }

    private void printDirectly(int num1, int num2) {

        String results = calc.calculate(num1, num2);
        System.out.println(results);
        
    }

    private void storeToFile(String myResults) { // Reference: https://www.javatpoint.com/java-filewriter-class
        try {
            FileWriter writer = new FileWriter("results.txt");
            writer.write(myResults);
            
            writer.close();
            System.out.println("Results have been stored in results.txt");
        } catch (IOException e) {
            System.out.println("An error occurred on the path.");
            e.printStackTrace();
        }
    }
    
}

