package actionmodel.state.common;

public abstract class State {
    public String stateName;

    public abstract void Handle(StateContext stateContext);
}
