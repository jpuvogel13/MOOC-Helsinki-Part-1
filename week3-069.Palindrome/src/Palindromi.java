import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reversed="";

        reversed=reverse(text);
        if(reversed.equals(text)){

            return true;
        }else
        return false;
    }

    public static String reverse(String text) {
        int length = text.length();
        String answer = "";
        char character;
        for (int i = text.length() - 1; i >= 0; i--) {
            character = text.charAt(i);
            answer += character;

        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
