public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vend = new VendingMachine(0);

        vend.selectItem();
        vend.insertCoin(10);
        vend.dispenseItem();
        vend.setOutOfOrder();
        vend.dispenseItem();
        vend.insertCoin(20);
        vend.selectItem();
    }
}
