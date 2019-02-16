package actionmodel.state.watermachine;

public class WaterEmpty implements DispenserState {
    public void press() {
        System.out.println ("water is empty" );
    }
}
