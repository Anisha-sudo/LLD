package adapterDP;

public class Main {
    public static void main(String[] args) {
        System.out.println("ADAPTER DESIGN");
        WeighingMachineAdapterInterface weighingMachineAdapter= new WeighingMachineAdapter();
        double wt=weighingMachineAdapter.getWeightInKg();
        System.out.println("Weight in KG:::"+wt);
    }
}
