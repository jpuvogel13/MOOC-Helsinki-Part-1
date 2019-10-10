
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        ArrayList<Student> list2 = new ArrayList<Student>();
        Scanner reader= new Scanner(System.in);
        String name= "j";
        while (name != ""){
        System.out.println("name: ");
        name= reader.nextLine();
        if(name.equals("")){
            break;
        }
            System.out.println("studentnumber: ");
            String studentNum=reader.nextLine();
        list.add(new Student(name, studentNum));


        }
        for(Student students : list) {
            System.out.println(students);

        }
        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for (Student students : list){
            String studentName= students.getName();
            if(studentName.contains(search)){
                System.out.println(students);
            }
        }



    }
}
