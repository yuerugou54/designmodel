package actionmodel.state.common;

public class ConcentrateStateA extends State {
    public ConcentrateStateA() {
        stateName = "状态A";
    }

    @Override
    public void Handle(StateContext stateContext) {
        stateContext.setState (new ConcentrateStateB ( ));
    }
}
