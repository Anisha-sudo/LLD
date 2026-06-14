package builderDP.Solution;

import java.util.ArrayList;
import java.util.List;

public class MtechStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects(){
        List<String> subjects=new ArrayList<>();
        subjects.add("mml");
        subjects.add("algorithm");
        subjects.add("spe");
        this.subjects=subjects;
        return this;
    }
}
