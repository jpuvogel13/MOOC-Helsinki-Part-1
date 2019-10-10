import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 5, 1, 2);

        Collections.addAll(list2, 5, 1, 2, 1, 40);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int thisNum = 0;
        int size = list2.size();

        for (int i = 0; i < size; i++) {

            thisNum = list2.get(i);

            if (list1.contains(thisNum)) {

                //do nothing
            } else {
                list1.add(thisNum);

            }

        }
    }
}



