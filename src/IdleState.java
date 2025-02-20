public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item Selected");
        machine.setMachineState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coin. Select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Cannot dispense item. No item selected.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine set to Out of Order.");
        machine.setMachineState(new OutOfOrderState());
    }
}
