package splitwise;

import java.util.List;

public class Expense {
    int id;
    String description;
    double amount;
    User paidByUser;
    SplitType splitType;
    List<Split> splitList;
}
