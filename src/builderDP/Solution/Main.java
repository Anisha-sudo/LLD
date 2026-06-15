package builderDP.Solution;

public class Main {
    public static void main(String[] args) {
        StudentBuilder mbabuilder=new MBAStudentBuilder();
        StudentBuilder mtechbuilder=new MtechStudentBuilder();
        DirectorC directormba=new DirectorC(mbabuilder);
        DirectorC directormtech=new DirectorC(mtechbuilder);

        Student mbaStudent=directormba.createStudent();
        Student mtechStudent=directormtech.createStudent();

        System.out.println(mbaStudent.toString());
        System.out.println(mtechStudent.toString());


    }
}
