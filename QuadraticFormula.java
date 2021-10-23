import java.util.Scanner;

public class QuadraticFormula {
    public static void main(final String[] args) {
            //Added scanner
        Scanner userInput = new Scanner (System.in);
        

            //userInput for variable 'b'
        System.out.println("Please enter the value of 'a':");
        double valueA = userInput.nextDouble();
            

            //userInput for variable 'a'
        System.out.println("Please enter the value of 'b'");
        double valueB = userInput.nextDouble();


            //userInput for variable 'c'
        System.out.println("Please enter the value of 'c");
        double valueC = userInput.nextDouble();


            //First step, figure the squareroot of 'b*b - 4ac'
    double squareRt = (Math.sqrt((valueB)*(valueB) - 4*(valueA*valueC)));


            //Second step, subract and add '-b' from the result of the square root
    double negBMinus = (-1*(valueB) - squareRt);
    double negBPlus = (-1*(valueB) + squareRt);

            //Third step, solve for 2a
    double divA = (2*(valueA));    
    
            //Last step, divide the result with 2a
    double answer1 = (negBMinus / divA);
    double answer2 = (negBPlus / divA);


            //Prints out the answer of the equation
    System.out.println("The answer is: " + "(" + (answer1) + ", " + (answer2) + ")");
    
    

    }
    
}
