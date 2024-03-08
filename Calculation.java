package Lab2Part2;

public class Calculation {
    
    public String calculate(int num1, int num2) {
        int addition = add(num1, num2);
        int subtraction = subtract(num1, num2);
        int multiply = multiply(num1, num2);
        return "The addition result is " + addition + "\n" + "The subtraction result is " + subtraction + "\n" + "The multiplication result is " + multiply;
    }
    
    public int add(int num1, int num2) { // Adding parameters for these
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;  
    }

}
