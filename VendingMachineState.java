package LabAssignment2_StateDesignPattern;

public interface VendingMachineState {
    void selectItem(VendingMachine machine);
    void insertCoin(VendingMachine machine, int amount);
    void dispenseItem(VendingMachine machine);
    void setOutOfOrder(VendingMachine machine);
}
