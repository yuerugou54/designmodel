package actionmodel.state.watermachine;

public class WaterFull implements  DispenserState {
    public void press() {
        System.out.println ("water is pouring" );
    }
}
