package actionmodel.state.common;

public class StateContext {
    private State state;

    public StateContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        System.out.println ("当前状态为：" + this.state.stateName);
        this.state = state;
        System.out.println ("状态变为：" + this.state.stateName);
        System.out.println ("...............");
    }

    public void request() {
        state.Handle (this);
    }
}
