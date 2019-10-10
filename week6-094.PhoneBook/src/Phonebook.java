import java.util.ArrayList;
import java.util.Iterator;

public class Phonebook {
    private ArrayList<Person> list= new ArrayList<Person>();


    public Phonebook() {
        this.list = new ArrayList();

    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.list.add(person);
    }

    public void printAll() {
        for (Person person : this.list) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : this.list) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";

    }
}

