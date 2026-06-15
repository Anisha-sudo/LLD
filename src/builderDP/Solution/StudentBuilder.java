package builderDP.Solution;

import java.util.List;

public abstract class StudentBuilder {
    int rollno;
    String name;
    String course;
    List<String> subjects;

    public  StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }
    public StudentBuilder setCourse(String course){
        this.course=course;
        return this;
    }
    abstract public StudentBuilder setSubjects();


    public Student build(){
        return new Student(this);
    }
}
