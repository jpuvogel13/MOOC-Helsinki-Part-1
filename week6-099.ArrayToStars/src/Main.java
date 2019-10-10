
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        int amount= array.length;
        int number=0;
        for (int i =0; i<amount; i++){
            number=array[i];
            for(int j = 1; j<=number; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}