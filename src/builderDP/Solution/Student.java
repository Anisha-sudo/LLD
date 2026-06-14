package builderDP.Solution;

import java.util.List;

public class Student {
    int rollno;
    String name;
    String course;
    List<String> subjects;
    Student(StudentBuilder studentBuilder){
        this.name=studentBuilder.name;
        this.course=studentBuilder.course;
        this.subjects=studentBuilder.subjects;
        this.rollno=studentBuilder.rollno;
    }

    public String toString(){
        return  this.name+this.course+this.rollno+this.subjects.get(0)+this.subjects.get(1);
    }

}
