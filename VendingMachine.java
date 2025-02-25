package LabAssignment2_StateDesignPattern;

public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory;
    private int balance;
    
    public VendingMachine(int inventory){
        this.inventory = inventory;
        this.balance = 0;
        this.currentState = new IdleState();
    }

    public void setState(VendingMachineState state){
        this.currentState = state;
    }

    public VendingMachineState getState(){
        return currentState;
    }

    public int getInventory(){
        return inventory;
    }

    public int getBalance(){
        return balance;
    }

    public void selectItem(){
        currentState.selectItem(this);
    }

    public void insertCoin(int amount){
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem(){
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder(){
        currentState.setOutOfOrder(this);
    }
}