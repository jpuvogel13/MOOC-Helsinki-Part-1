import java.util.Scanner;
import java.util.Random;
public class NightSky{
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;


    public NightSky(double density){
        this.density=density;
        this.width=20;
        this.height=10;
    }
    public NightSky(int width, int height){
        this.width=width;
        this.height=height;
        this.density=.1;
    }
    public NightSky(double density, int width, int height){
        this.density=density;
        this.height=height;
        this.width=width;

    }

    public void printLine(){
        Random random= new Random();
        for(int i=1; i <=this.width; i++){
            double newDensity=random.nextDouble();
                if (newDensity <= this.density) {
                    System.out.print("*");
                    starsInLastPrint++;
                } else
                    System.out.print(" ");
            }
        }

        public void print(){
            starsInLastPrint=0;
            for (int i = 0; i < this.height; i++) {
                printLine();
            }
            System.out.println("");
        }

        public int starsInLastPrint(){
        return starsInLastPrint;
        }
    }

