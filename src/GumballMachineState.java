/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public abstract class GumballMachineState implements GumballMachineEvent {
    protected final GumballMachineController controller;

    public GumballMachineState(GumballMachineController controller) {
        this.controller = controller;
    }
}
