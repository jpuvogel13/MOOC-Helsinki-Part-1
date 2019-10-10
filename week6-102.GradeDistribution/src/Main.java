import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only sonce. If you need scanner in multiple places, you can pass it as parameter
        int grade=0;
        Grades scores = new Grades(reader, grade );
        System.out.println("Type exam scores, -1 completes:");
        while (grade != -1) {
            grade = Integer.parseInt(reader.nextLine());
            scores.addGrade(grade,reader);

        }
        scores.print(grade);
    }
}