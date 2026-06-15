package builderDP.Problem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int studentID;
    int age;
    String branch;
    int roomno;
    String name;
    String fatherName;
    String motherName;
    String city;
    String emailId;
    int mobile;
    List<String> subjects=new ArrayList<>();
    //for creating complex class object
    //many variables , one big constuctor can be an issue.
    // there can be multiple contructor and there is no way to have different construtor if signature is same but value is diff.
    //using builder helps create the object step by step:
    //some variables will be set first and next others and so on...
    //we can have setters for variables accordingly and every setter returns builder object and final build method will return actual class object.
    //so step wise we set our object and we get final obj alltogether.
    // student and it's builder should have all variables same.


    Student(int studentID){
        this.studentID=studentID;
    }
    Student(int studentID,String name,String fatherName,String motherName,String city,int age,String emailID,String branch,List<String>subjects,int mobile){
        this.studentID=studentID;
        this.city=city;
        this.name=name;
        this.fatherName=fatherName;
        this.motherName=motherName;
        this.age=age;
        this.emailId=emailID;
        this.branch=branch;
        this.subjects=subjects;
        this.mobile=mobile;
    }
    public String toString() {
        return " roll number: " + this.studentID +
                " age: " + this.age +
                " name: " + this.name +
                " branch: " + this.branch +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2) +
                " mobile no: " + this.mobile +
                " email id: " + this.emailId;
    }
}
