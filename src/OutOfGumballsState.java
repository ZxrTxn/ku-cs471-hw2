/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class OutOfGumballsState extends GumballMachineState {
    public OutOfGumballsState(GumballMachineController controller) {
        super(controller);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() { }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispenseGumball() { }
}
