
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        double numb1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        double numb2 = Integer.parseInt(reader.nextLine());
        double div = numb1/numb2;
        System.out.println("Division: " + numb1 + "/" + numb2 + "=" + div);
        // Implement your program here. Remember to ask the input from user.
    }
}
