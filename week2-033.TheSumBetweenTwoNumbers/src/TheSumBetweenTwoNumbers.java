
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int low;
        int high;
        int sum=0;
        System.out.print("First: ");
        low=Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        high=Integer.parseInt(reader.nextLine());
        while(low<=high){
            sum+=low;
            low++;

        }
        System.out.println("The sum is now " + sum);
    }
}
