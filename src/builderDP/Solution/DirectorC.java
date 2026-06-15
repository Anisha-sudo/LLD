package builderDP.Solution;

public class DirectorC {
    StudentBuilder studentBuilder;
    DirectorC(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }
    public Student createStudent(){
       if(studentBuilder instanceof MBAStudentBuilder){
           return createMBAStudent();
       }else
           return createMtechStudent();

    }

    public Student createMBAStudent(){
      return  studentBuilder.setName("Doll").setRollno(123).setCourse("mba").setSubjects().build();
    }
    public Student createMtechStudent(){
        return  studentBuilder.setName("ULLU").setRollno(234).setCourse("mtech").setSubjects().build();
    }
}
