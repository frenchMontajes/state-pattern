public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("The machine is out of order");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("The machine is out of order, Can't insert coin");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("The machine is out of order, Cannot dispense");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("The machine is already out of order");
    }
}
