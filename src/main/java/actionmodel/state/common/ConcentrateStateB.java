package actionmodel.state.common;

public class ConcentrateStateB extends State {
    public ConcentrateStateB() {
        stateName="状态B";
    }

    @Override
    public void Handle(StateContext stateContext) {
        stateContext.setState(new ConcentrateStateA ());
    }
}
