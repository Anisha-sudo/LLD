package iteratorDP;

import java.util.*;

public class Library {

    List<Book> books;
    public Library(List<Book>books){
        this.books=books;
    }
    public Iterator createIterator(){

        List<Integer>demo=new ArrayList<>();
        demo.add(1);
        demo.add(2);
        demo.add(3);
        demo.iterator().hasNext();
        Map<Integer,String> mp= new HashMap<>();
        mp.put(1,"Anisha");
        mp.put(2,"Rani");
        mp.put(3,"Rani");
        mp.entrySet().iterator().hasNext();
        return new BookIterator(books);
    }
}
