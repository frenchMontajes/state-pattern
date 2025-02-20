public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Cannot select item. Dispensing in progress.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coin. Dispensing in progress.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.setMachineState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot set out of order while dispensing.");
    }
}
