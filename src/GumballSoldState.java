/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class GumballSoldState extends GumballMachineState {
    public GumballSoldState(GumballMachineController controller) {
        super(controller);
    }

    @Override
    public void insertQuarter() { }

    @Override
    public void ejectQuarter() { }

    @Override
    public void turnCrank() { }

    @Override
    public void dispenseGumball() {
        final int gumballAvailable = controller.getGumballAvailable() - 1;

        controller.setGumballAvailable(gumballAvailable);
        System.out.println("A gumball comes rolling out the slot");

        if (gumballAvailable > 0) {
            controller.setState(new NoQuarterState(controller));
        } else {
            System.out.println("Oops, out of gumballs!");

            controller.setState(new OutOfGumballsState(controller));
        }
    }
}
