/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class HasQuarterState extends GumballMachineState {
    public HasQuarterState(GumballMachineController controller) {
        super(controller);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");

        controller.setState(new NoQuarterState(controller));
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");

        controller.setState(new GumballSoldState(controller));
    }

    @Override
    public void dispenseGumball() { }
}
