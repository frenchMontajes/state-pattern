public class VendingMachine {
    private VendingMachineState machineState;
    private int balance;
    private int inventory;

    public VendingMachine(int balance) {
        this.inventory = 0;
        this.balance = balance;
        this.machineState = new IdleState() ;
    }

    public void setMachineState(VendingMachineState machineState) {
        this.machineState = machineState;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }
    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public void selectItem() {
        machineState.selectItem(this);
    }

    public void insertCoin(int amount) {
        machineState.insertCoin(this, amount);
    }
    public void dispenseItem(){
        machineState.dispenseItem(this);
    }
    public void setOutOfOrder() {
        machineState.setOutOfOrder(this);
    }
}
