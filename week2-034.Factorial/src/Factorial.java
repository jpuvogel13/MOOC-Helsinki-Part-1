import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter=1;
        int factorial=1;
        int numb=1;


        System.out.println("Type a number: ");
        numb=Integer.parseInt(reader.nextLine());
        while(counter<=numb){
            factorial*=counter;
            counter++;



        }
        System.out.println("Facotrial is " + factorial);
    }
}
