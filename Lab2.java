package Lab2Part2;

public class Lab2 {
    public static void main(String[] args) {

        NumberCollector numColl = new NumberCollector();
        numColl.selectInputMethod();
        int num1 = numColl.inputFromUser();
        int num2 = numColl.inputFromUser();

        Results r = new Results();
        r.resultsHandler(num1, num2);

    }
    
}
