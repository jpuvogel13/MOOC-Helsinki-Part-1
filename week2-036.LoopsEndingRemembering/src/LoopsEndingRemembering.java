import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int integer=0;
        int sum=0;
        int counter=0;
        double avg;
        int odd=0;
        int even=0;
        System.out.println("Type numbers: ");
        while(true){
            sum+=integer;
        if(integer%2==0 && integer>0){
            even++;

        } else if (integer%2==1 && integer>0){
            odd++;
        }
        integer= Integer.parseInt(reader.nextLine());
        if (integer == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            counter++;

        }
        avg= (double) sum/counter;
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        }
    }

