package CompositeDP.problem;

public class FileSystem {

    public static void main(String[] args) {
        File file1= new File("file1");
        File file2 = new File("file2");
        Directory subDir= new Directory();
        Directory directory=new Directory();
        directory.add(file1);
        directory.add(subDir);
        subDir.add(file2);
        directory.printContent();

    }
}
