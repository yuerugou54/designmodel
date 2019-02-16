package actionmodel.state.common;

/**
 * 状态模式
 */
public class StateCommonMain {

    public static void main(String[] args) {
        StateContext stateContext = new StateContext (new ConcentrateStateA ( ));
        stateContext.request ( );
        stateContext = new StateContext (new ConcentrateStateB ( ));
        stateContext.request ( );
    }
}
