import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name= reader.nextLine();
        int length = name.length();
        String answer= "";
        for(int i=name.length()-1; i>=0; i--){
            char letter= name.charAt(i);

                    answer+= letter;

        }
        System.out.print("In reverse order: " + answer);
    }
}
