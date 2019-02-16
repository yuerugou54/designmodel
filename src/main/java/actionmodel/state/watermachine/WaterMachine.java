package actionmodel.state.watermachine;

public class WaterMachine {
    private static Integer capacity = 20;
    private static DispenserState dispenserState;

    public WaterMachine(DispenserState dispenserState) {
        this.dispenserState = dispenserState;
    }

    public DispenserState getDispenserState() {
        return dispenserState;
    }

    public void setDispenserState(DispenserState dispenserState) {
        this.dispenserState = dispenserState;
    }

    public void press() {
        capacity--;
        if (capacity <= 0) {
            setDispenserState (new WaterEmpty ( ));
        }
        dispenserState.press ( );
    }
}
