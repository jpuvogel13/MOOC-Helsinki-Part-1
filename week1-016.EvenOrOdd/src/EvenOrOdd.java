
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numb1 = Integer.parseInt(reader.nextLine());
        if (numb1 % 2 == 1 || numb1 % 2 == -1){
            System.out.println("Number " + numb1 + " is odd");

        } else if (numb1 % 2 ==0){
            System.out.println("Number " + numb1 + " is even");
        }      // Type your program here

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        //System.out.println( 1%2 );
        // System.out.println( 2%2 );
         //System.out.println( 3%2 );
        //System.out.println( 4%2 );
        // System.out.println( 5%2 );
         //System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );

    }
}
