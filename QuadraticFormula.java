import java.util.Scanner;

public class QuadraticFormula {
    public static void main(final String[] args) {
            //Added scanner
        Scanner userInput = new Scanner (System.in);
        

            //userInput for variable 'b'
        System.out.println("Please enter the value of b:");
        double valueB = userInput.nextDouble();
            

            //userInput for variable 'a'
        System.out.println("Please enter the value of 'a'");
        double valueA = userInput.nextDouble();


            //userInput for variable 'c'
        System.out.println("Please enter the value of 'c");
        double valueC = userInput.nextDouble();


            //First step, figure the squareroot of 'b*b - 4ac'
    double squareRt = (Math.sqrt((valueB)*(valueB) - 4*(valueA*valueC)));


            //Second step, subract and add '-b' from the result of the square root
    double negBPlus = (-(valueB) - squareRt);
    double negAPlus = (-(valueB) + squareRt);

            //Third step, divide the result with '2*a'
    double answer1 = (negBPlus / 2*(valueA));
    double answer2 = (negAPlus / 2*(valueA));


            //Prints out the answer of the equation
    System.out.println("The answer is: " + "(" + (answer1) + ", " + (answer2) + ")");
    
    

    }
    
}
