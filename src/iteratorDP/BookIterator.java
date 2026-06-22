package iteratorDP;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {
    List<Book> books;
    int index;
    BookIterator(List<Book> books){
        this.books=books;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<books.size();

    }

    @Override
    public Object next() {
        if(!hasNext())return null;
        return books.get(index++);

    }
}
