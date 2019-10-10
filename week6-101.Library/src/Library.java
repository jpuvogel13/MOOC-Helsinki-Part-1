
import java.util.ArrayList;

public class Library {
   private ArrayList<Book> list;

   public Library() {
       this.list = new ArrayList<Book>();

   }

   public void addBook(Book newBook) {
      this.list.add(newBook);

   }


   public void printBooks() {
        for(Book k : this.list){
            System.out.println(k);

        }
   }

   public ArrayList<Book> searchByTitle(String title){
      ArrayList<Book> found = new ArrayList<Book>();
      for(Book  k : this.list){
          if(StringUtils.included(k.title(), title)){
              found.add(k);
          }
      }
      return found;
   }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book  k : this.list){
            if(k.publisher().contains(publisher)){
            found.add(k);
            }
        }
        return found;

        }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book  k : this.list){
            if(k.year()==year){
            found.add(k);
            }
        }
        return found;
        }





}


