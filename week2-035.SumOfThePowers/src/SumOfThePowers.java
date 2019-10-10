
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                double numb=2;
                double expo= 0;
                int result=0;
                int counter=1;
        System.out.println("Type a number: ");
        counter=Integer.parseInt(reader.nextLine());
        while(counter>=expo) {
            result= result + (int) Math.pow(numb, expo);
            expo++;
        }
        System.out.println("The result is " + result);


    }
}
