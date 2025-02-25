package LabAssignment2_StateDesignPattern;

public class OutOfOrderState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("\nCannot select any item. Machine is out of order.");
    }
  
    @Override
    public void insertCoin(VendingMachine machine, int amount){
        System.out.println("\nCannot insert coins. Machine is out of order.");
    }

    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("\nCannot dispense any item. Machine is out of order.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("\nMachine set out of order.");
    }
}
