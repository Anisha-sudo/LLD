package builderDP.Solution;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects(){
        List<String> subjects=new ArrayList<>();
        subjects.add("economics");
        subjects.add("productDesign");
        subjects.add("macroeco");
        this.subjects=subjects;
        return this;
    }
}
