package actionmodel.state.train;

public class StopState extends SpeedAbstractState {
    @Override
    public void Run(Train train) {
        System.out.println ("当前列车正在停止。准备让行：列车时速为" + train.getSpeed ( ));
    }
}
