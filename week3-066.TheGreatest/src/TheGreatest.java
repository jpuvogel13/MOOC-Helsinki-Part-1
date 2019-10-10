import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int first;
        int counter=1;
        int greatest=list.get(0);
        int size=list.size();
        while(size-1>=counter){
            first=list.get(counter);
            counter++;
            if(first>greatest){
                greatest=first;
            }

        }

            return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(-2);
        lista.add(-28);
        lista.add(-7);
        lista.add(-1);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
