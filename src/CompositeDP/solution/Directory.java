package CompositeDP.solution;

import CompositeDP.problem.File;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemobjectList;

    Directory(String name,List<FileSystem>fileSystemobjects){
        fileSystemobjectList=new ArrayList<>();
        fileSystemobjectList=fileSystemobjects;
        this.directoryName=name;
    }
    public void add(FileSystem object){
        this.fileSystemobjectList.add(object);
    }
    public void remove(FileSystem object){
        this.fileSystemobjectList.remove(object);
    }

    public void printContent(){
        System.out.println("This is a directory::" +directoryName);
        for (FileSystem obj :fileSystemobjectList){
           obj.printContent();
        }
    }
}
