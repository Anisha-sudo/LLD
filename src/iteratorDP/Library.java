package iteratorDP;

import java.util.*;

public class Library {

    List<Book> books;
    public Library(List<Book>books){
        this.books=books;
    }
    public Iterator createIterator(){
        return new BookIterator(books);
    }
}
