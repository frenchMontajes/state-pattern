public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.setBalance(machine.getBalance() + amount);
        System.out.println("Inserted " + machine.getBalance() + " coins.");
        machine.setMachineState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine set to Out of Order.");
        machine.setMachineState(new OutOfOrderState());
    }
}
