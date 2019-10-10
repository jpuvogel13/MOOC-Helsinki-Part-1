
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter=1;
        int numb;
        System.out.println("Up to what number? ");
        numb=Integer.parseInt(reader.nextLine());
        while(counter<=numb){
            System.out.println(counter);
            counter++;

        }

        // Write your code here
        
    }
}
