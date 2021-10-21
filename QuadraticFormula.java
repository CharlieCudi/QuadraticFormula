import java.util.Scanner;
public class QuadraticFormula {
    public static void main(final String[] args) {

        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Please enter the value of b:");
        String valueB = userInput.nextLine();
            
            //Prints out value of 'b'
            System.out.println(valueB);
        
        System.out.println("Please enter the value of 'a'");
        String valueA = userInput.nextLine();

            //Prints out value of 'a'
            System.out.println(valueA);

        System.out.println("Please enter the value of 'c");
        String valueC = userInput.nextLine();

            //Prints out value of 'c'
        System.out.println(valueC);
        

    }
    
}
