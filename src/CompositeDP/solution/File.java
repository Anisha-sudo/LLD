package CompositeDP.solution;

public class File implements  FileSystem{
    String fileName;
    public File(String fileName){
        this.fileName=fileName;
    }
    public void printContent(){
        System.out.println("This is a file "+fileName);
    }
}
