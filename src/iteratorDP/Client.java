package iteratorDP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        Book book1=new Book("Book1");
        Book book2=new Book("Book2");
        Book book3=new Book("Book3");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library lib= new Library(books);
        Iterator it=lib.createIterator();
        while(it.hasNext()){
            Book book=(Book)it.next();
            System.out.println(book.getName());
        }

    }
}
