package LabAssignment2_StateDesignPattern;

public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("\nYou already selected an item. Please wait while dispensing. ");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount){
        System.out.println("\nYou already inserted coins. Please wait while dispensing. ");
    }

    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("\nItem dispensed. Machine's idle...");
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("\nMachine set out of order.");
        machine.setState(new OutOfOrderState());
    }
}
