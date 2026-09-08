package splitwise;

import splitwise.splitCriteria.EqualSplit;
import splitwise.splitCriteria.PercentSplit;
import splitwise.splitCriteria.SplitCriteria;
import splitwise.splitCriteria.UnequalSplit;

public class SplitFactory {

    public static SplitCriteria getSplitObj(SplitType splitType){
        if(splitType.equals(SplitType.valueOf("EQUAL"))){
            return new EqualSplit();
        }else if(splitType.equals(SplitType.valueOf("UNEQUAL"))){
            return new UnequalSplit();
        }else return new PercentSplit();
    }
}
