public class Main {
    public static void main(String[] args) {
        Counter count = new Counter(7);
        count.increase(5);
        count.decrease();
        count.decrease(4);
        System.out.println(count);
         // write testcode here
    }
}
