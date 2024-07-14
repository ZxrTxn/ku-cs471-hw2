/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

public class GumballMachineController implements GumballMachineEvent {
    private int gumballAvailable;

    private GumballMachineState currentState;

    public GumballMachineController() {
        this.gumballAvailable = 5;

        // set initial state
        this.currentState = new NoQuarterState(this);
    }

    @Override
    public void insertQuarter() {
        this.currentState.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        this.currentState.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        this.currentState.turnCrank();
    }

    @Override
    public void dispenseGumball() {
        this.currentState.dispenseGumball();
    }

    void showStatus() {
        System.out.println();

        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");

        System.out.printf("Inventory: %d gumball", this.gumballAvailable);
        if (this.gumballAvailable != 1) {
            System.out.print('s');
        }
        System.out.println();

        if (this.gumballAvailable > 0) {
            System.out.println("Machine is waiting for quarter");
        } else {
            System.out.println("Machine is sold out");
        }

        System.out.println();
    }

    void setGumballAvailable(int gumballAvailable) {
        this.gumballAvailable = gumballAvailable;
    }

    void setState(GumballMachineState state) {
        this.currentState = state;
    }

    public int getGumballAvailable() {
        return this.gumballAvailable;
    }
}
