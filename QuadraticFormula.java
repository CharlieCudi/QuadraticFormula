import java.util.Scanner;
public class QuadraticFormula {
    public static void main(final String[] args) {

        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Please enter the value of b:");
        double valueB = userInput.nextDouble();
            
            //Prints out value of 'b'
            System.out.println(valueB);
        
        System.out.println("Please enter the value of 'a'");
        double valueA = userInput.nextDouble();

            //Prints out value of 'a'
            System.out.println(valueA);

        System.out.println("Please enter the value of 'c");
        double valueC = userInput.nextDouble();

            //Prints out value of 'c'
            System.out.println(valueC);

    double squareRt = (Math.sqrt((valueB)*(valueB) - 4*(valueA*valueC)));

        //Result of the square root portion
        System.out.println(squareRt);
    
    double negBPlus = (-(valueB) - squareRt);
    double negAPlus = (-(valueB) + squareRt);

    double answer1 = (negBPlus / 2*(valueA));
    double answer2 = (negAPlus / 2*(valueA));

    System.out.println("The answer is: " + "(" + (answer1) + "," + (answer2) + ")");
    
    

    }
    
}
