package CompositeDP.problem;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList=new ArrayList<>();

    public void add(Object object){
        this.objectList.add(object);
    }
    public void remove(Object object){
        this.objectList.remove(object);
    }

    public void printContent(){
        System.out.println("This is a directory");
        for (Object obj :this.objectList){
            if(obj instanceof Directory){
                ((Directory) obj).printContent();
            }else{
                ((File)obj).printContent();
            }
        }
    }

}
