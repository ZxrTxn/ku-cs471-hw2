/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class NoQuarterState extends GumballMachineState {
    public NoQuarterState(GumballMachineController controller) {
        super(controller);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");

        controller.setState(new HasQuarterState(controller));
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispenseGumball() { }
}
