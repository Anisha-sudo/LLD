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

        //whichever thing we want to iterate we should have object of that and we should have iterator for that
        //iterators are used to traverse the collection of objects,and for each object we want to perform some operation
        //like hasNext() and next() are methods of iterator interface
        BookIterator dataType=new BookIterator(books);
        dataType.hasNext();
        dataType.next();

        while(it.hasNext()){
            Book book=(Book)it.next();
            System.out.println(book.getName());
        }

    }
}
