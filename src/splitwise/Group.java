package splitwise;

import java.util.List;

public class Group {
    int groupId;
    int groupName;
    List<User> groupUsers;
    List<Expense>expenseList;
    ExpenseController expenseController;

    public  void addExpense(User paidByUser, double amount, SplitType splitType, String description, List<Split>splitList){
        Expense expense=expenseController.createExpense(paidByUser,amount , splitType,description, splitList);
        expenseList.add(expense);
    }



}
