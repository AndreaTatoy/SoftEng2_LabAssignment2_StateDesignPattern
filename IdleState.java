package LabAssignment2_StateDesignPattern;

public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("\nItem selected.");
        machine.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount){
        System.out.println("\nSelect an item first before inserting coins.");
    }

    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("\nSelect an item first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("\nMachine set out of order.");
        machine.setState(new OutOfOrderState());
    }
}
