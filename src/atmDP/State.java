package atmDP;

public abstract class State {
   public  void insertCard(Atm atm){
        System.out.println("OPPS EROOOOOOOOOOOOOORRRRRRRRRRR");
   };
   public boolean authenticateCard(Atm atm,Card card,int pin){
       System.out.println("OPPS EROOOOOOOOOOOOOORRRRRRRRRRR");
       return  false;
   }
   public  void selectOperation(Card card,int op,Atm atm){
       System.out.println("OPPS EROOOOOOOOOOOOOORRRRRRRRRRR");
   }
   public void checkBalance(Card card){
       System.out.println("OPPS EROOOOOOOOOOOOOORRRRRRRRRRR");
   }
    public void withdrawCash(Card card, Atm atm){
       System.out.println("OPPS EROOOOOOOOOOOOOORRRRRRRRRRR");
   }
    public  boolean withdrawCash(Atm atm,int amount,Card card){
        System.out.println("OPPS EROOOOOOOOOOOOOORRRRRRRRRRR");
        return false;
    }
   public  void returnCard(Atm atm){
       System.out.println("OPPS EROOOOOOOOOOOOOORRRRRRRRRRR");
   }
}
