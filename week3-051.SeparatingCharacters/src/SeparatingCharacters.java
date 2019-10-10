
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter=1;
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        for(int i=0; i<=length-1; i++){

            char answer= name.charAt(i);
            System.out.println(counter + ". character: " + answer);
            counter++;
        }
    }
}
