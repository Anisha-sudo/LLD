package splitwise.splitCriteria;

import splitwise.Split;

import java.util.List;

public interface SplitCriteria {
    public void validateSplitRequest(List<Split> splitList,double expenseAmt);
}
