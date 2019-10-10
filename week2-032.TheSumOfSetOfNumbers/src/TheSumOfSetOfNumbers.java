
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter=1;
        int sum=0;
        int numb;

        System.out.println("Until what?");
        numb=Integer.parseInt(reader.nextLine());
        while(counter<=numb){
            sum=sum + counter;
            counter++;

        }
        System.out.println("Sum is " + sum);
    }
}
