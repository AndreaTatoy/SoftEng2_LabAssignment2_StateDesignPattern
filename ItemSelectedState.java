package LabAssignment2_StateDesignPattern;

public class ItemSelectedState implements VendingMachineState{
    @Override
    public void selectItem(VendingMachine machine){
        System.out.println("\nYou already selected an item. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount){
        System.out.println("\nCoins inserted. Now dispensing.");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine){
        System.out.println("\nItem dispensed.");
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine){
        System.out.println("\nMachine set out of order.");
        machine.setState(new OutOfOrderState());
    }
}
