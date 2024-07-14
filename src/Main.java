/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class Main {
    public static void main(String[] args) {
        final GumballMachineController controller = new GumballMachineController();

        controller.showStatus();

        controller.insertQuarter();
        controller.turnCrank();
        controller.dispenseGumball();

        controller.showStatus();

        controller.insertQuarter();
        controller.ejectQuarter();
        controller.turnCrank();

        controller.showStatus();

        controller.insertQuarter();
        controller.turnCrank();
        controller.dispenseGumball();
        controller.insertQuarter();
        controller.turnCrank();
        controller.dispenseGumball();
        controller.ejectQuarter();

        controller.showStatus();

        controller.insertQuarter();
        controller.insertQuarter();
        controller.turnCrank();
        controller.dispenseGumball();
        controller.insertQuarter();
        controller.turnCrank();
        controller.dispenseGumball();
        controller.insertQuarter();
        controller.turnCrank();

        controller.showStatus();
    }
}
