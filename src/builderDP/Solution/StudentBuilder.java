package builderDP.Solution;

import java.util.List;

public abstract class StudentBuilder {
    int rollno;
    String name;
    String course;
    List<String> subjects;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    abstract public StudentBuilder setSubjects();

    public Student build(){
        return new Student(this);
    }
}
