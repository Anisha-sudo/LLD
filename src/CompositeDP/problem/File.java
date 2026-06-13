package CompositeDP.problem;

public class File  {
    String fileName;
    public File(String fileName){
        this.fileName=fileName;
    }
    public void printContent(){
        System.out.println("this is a file "+fileName);
    }
}
