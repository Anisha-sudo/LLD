package adapterDP;

public class WeighingMachineAdapter implements WeighingMachineAdapterInterface{
   ImperialWeighingMachineInterface weighingMachine;

   private ImperialWeighingMachineInterface getImperialWeighingMachine(){
       if(weighingMachine==null){
           return  weighingMachine=new ImperialWeighingMachine();
       }
       return weighingMachine;
   }
    @Override
    public double getWeightInKg() {
        return getImperialWeighingMachine().getWeightInPound()*0.45;
    }
}
