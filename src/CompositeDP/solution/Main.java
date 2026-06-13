package CompositeDP.solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileSystem file1 = new File("nun.mp4");
        FileSystem file2 = new File("conjuring.mp4");
        FileSystem file3 = new File("metaData.txt");
        FileSystem directory1 = new Directory("horror movies::",Arrays.asList(file1, file2));
        FileSystem mainDirectory = new Directory("main Directory::",Arrays.asList(directory1, file3));
        mainDirectory.printContent();
    }
}
