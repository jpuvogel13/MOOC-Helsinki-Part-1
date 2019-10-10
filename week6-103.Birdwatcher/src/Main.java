import sun.misc.GC;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        BirdWatcher birdList= new BirdWatcher();
        Scanner reader = new Scanner(System.in);
        String prompt = "";
        while (!(prompt.equals("Quit"))) {
            System.out.print("? ");
            prompt = reader.nextLine();
            if (prompt.equalsIgnoreCase("add")) {
                addBird(reader,birdList);
            } else if (prompt.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                String birdName=reader.nextLine();
                increaseCount(birdName,birdList);
            } else if (prompt.equalsIgnoreCase("Statistics")) {
                birdList.Statistics();
            } else if (prompt.equalsIgnoreCase("Show")) {
                System.out.println("What?");
                String birdName=reader.nextLine();
                showBird(birdName,birdList);
            }

            // implement your program here
            // do not put all to one method/class but rather design a proper structure to your program

            // Your program should use only one Scanner object, i.e., it is allowed to call
            // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        }
    }
    private static void addBird(Scanner reader, BirdWatcher birdList){
        System.out.print("Name: ");
        String name=reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName=reader.nextLine();
        birdList.addBird(name,latinName);
    }
    public static void increaseCount(String bird, BirdWatcher birdList){
    for(Bird b : birdList.getBirds()){
        if(b.getName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
            b.increaseCount();
            return;
        }
    }
    System.out.println("Is not a bird!");
    }
    public static void showBird(String bird, BirdWatcher birdList){
        for (Bird b : birdList.getBirds()){
            if(b.getName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)){
                System.out.println(b);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

}
