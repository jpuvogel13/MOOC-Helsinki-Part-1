
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int low;
        int high;

        System.out.print("First: ");
        low=Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        high= Integer.parseInt(reader.nextLine());
        while(low<=high){
            System.out.println(low);
            low++;

        }
        // write your code here

    }
}
