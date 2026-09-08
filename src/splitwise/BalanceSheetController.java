package splitwise;

import java.util.List;

public class BalanceSheetController {
      public void updateBalanceSheet(User paidByUser, List<Split> splitList, double amount){

            paidByUser.balanceSheet.totalPayment=paidByUser.balanceSheet.totalPayment+amount;


            for(Split sp:splitList){
                  if(sp.user.userId.equals(paidByUser.userId)){
                        paidByUser.balanceSheet.totalExp+=sp.amount;

                  }else{
                        sp.user.balanceSheet.totalExp += sp.amount;
                        paidByUser.balanceSheet.totalToGet+= sp.amount;
                        sp.user.balanceSheet.totalToGive+=sp.amount;

                        if(sp.user.balanceSheet.friendBalanceMap.containsKey(paidByUser.userId)){
                               Balance bal= sp.user.balanceSheet.friendBalanceMap.get(paidByUser.userId);
                               bal.amountToSend+=sp.amount;
                         }else{
                               Balance bal= new Balance();
                               bal.amountToSend=sp.amount;
                               sp.user.balanceSheet.friendBalanceMap.put(paidByUser.userId,bal);
                         }
                        if(paidByUser.balanceSheet.friendBalanceMap.containsKey(sp.user.userId)){
                              Balance bal= paidByUser.balanceSheet.friendBalanceMap.get(sp.user.userId);
                              bal.amountToGet+=sp.amount;
                        }else{
                              Balance bal= new Balance();
                              bal.amountToGet=sp.amount;
                           paidByUser.balanceSheet.friendBalanceMap.put(sp.user.userId,bal);
                        }

                  }
            }
      }
}
