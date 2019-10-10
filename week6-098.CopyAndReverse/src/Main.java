import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // write testcode here




    }

    public static int[] copy(int[] array) {
        int amount = array.length;
        int[] number = new int[amount];

        for (int i = 0; i<amount; i++){
            number[i]=array[i];
        }
        return number;
        }
        public static int[] reverseCopy(int[] array){
        int amount2=array.length;
        int counter=array.length-1;
        int[]number2= new int[amount2];
        for (int i=0; i <amount2; i++){
            number2[i]=array[counter];
            counter--;
        }
        return number2;
        }

    }


