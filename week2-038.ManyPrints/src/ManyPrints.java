
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count;
        int counter=1;
        String phrase= "In the beginning there were the swamp, the hoe and Java.";
        System.out.println("How many?");
        count=Integer.parseInt(reader.nextLine());
        while(counter<=count){
            counter++;
            printText();
        }
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times

    }
}
