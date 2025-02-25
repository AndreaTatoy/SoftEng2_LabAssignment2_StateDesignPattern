package LabAssignment2_StateDesignPattern;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);

        machine.insertCoin(2);

        machine.selectItem();
        machine.selectItem();

        machine.insertCoin(2);
        machine.selectItem();   
        machine.insertCoin(2);
        machine.dispenseItem();

        machine.setOutOfOrder();
        machine.selectItem();
        machine.insertCoin(5);
        machine.dispenseItem();
    }
}
