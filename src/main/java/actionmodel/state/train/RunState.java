package actionmodel.state.train;

public class RunState extends SpeedAbstractState {
    @Override
    public void Run(Train train) {
        if (train.isGiveWay ( )) {
            train.setState (new StopState ( ));
            train.Run ( );
        } else {
            System.out.println ("当前时速为：" + train.getSpeed ( ) + "正在匀速行驶。");
        }
    }
}
