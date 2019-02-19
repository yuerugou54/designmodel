package actionmodel.state.train;

public class SlowState extends SpeedAbstractState {
    @Override
    public void Run(Train train) {
        if (train.getSpeed ( ) > 200) {
            System.out.println ("当前列车时速为：" + train.getSpeed ( ) + "列车正在减速。");
        } else {
            train.setState (new RunState ( ));
            train.Run ( );
        }
    }
}
