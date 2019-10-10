public class Book {
private String title;
private String publisher;
private int year;

public Book(String title,String publisher, int year){
    this.publisher=publisher;
    this.year=year;
    this.title=title;
}
public String title(){
    return this.title;
}
public String publisher(){
    return this.publisher;
}
public int year(){
    return this.year;
}
public String toString(){
    return this.title + ", " + this.publisher + ", " + this.year;
}


}
