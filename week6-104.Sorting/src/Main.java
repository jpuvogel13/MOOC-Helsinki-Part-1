
public class Main {
    public static void main(String[] args) {
        // write testcode here\\\
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        int counter = 0;
        for (int i = 1; i <= array.length - 1; i++) {
            if (smallest > array[i]) {
                smallest = array[i];

            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int counter = 0;
        for (int i = 1; i <= array.length - 1; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                counter = i;
            }
        }
        return counter;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[array.length - 1];
        int counter = 0;
        for (int i = index; i <= array.length - 1; i++) {
            if (smallest >= array[i]) {
                smallest = array[i];
                counter = i;
            }
        }
        return counter;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap1=array[index1];
        int swap2=array[index2];
        array[index1]=swap2;
        array[index2]=swap1;
        }


    public static void sort(int[] array) {
        for(int i= 0; i<=array.length-1; i++){
           int smallest = indexOfTheSmallestStartingFrom(array, i);
           swap(array,i,smallest);

        }

    }


}

