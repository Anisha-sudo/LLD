package splitwise;

import splitwise.splitCriteria.SplitCriteria;

import java.util.List;

public class ExpenseController {
   BalanceSheetController balanceSheetController;
   public ExpenseController(){
       balanceSheetController=new BalanceSheetController();
   }
    public Expense createExpense(User paidByUser, double amount, SplitType splitType, String description, List<Split>splitList){
        SplitCriteria splitCriteria= SplitFactory.getSplitObj(splitType);
        splitCriteria.validateSplitRequest(splitList,amount);
        Expense expense= new Expense();


        balanceSheetController.updateBalanceSheet(paidByUser,splitList,amount);

    }
}
