
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numb1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int numb2 = Integer.parseInt(reader.nextLine());
        int max= Math.max(numb1, numb2);
        System.out.println("The bigger number of the two numbers given was: " + max);
        // Implement your program here. Remember to ask the input from user
    }
}
