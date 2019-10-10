import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky NightSky = new NightSky(2, 3);
        NightSky.print();
        NightSky.starsInLastPrint();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
