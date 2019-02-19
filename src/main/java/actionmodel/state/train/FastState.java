package actionmodel.state.train;

public class FastState extends SpeedAbstractState {
    @Override
    public void Run(Train train) {
        if (train.getSpeed ( ) < 200) {
            System.out.println ("列车时速为：" + train.getSpeed ( ) + ",列车正在加速。");
        } else {
            train.setState (new SlowState ( ));
            train.Run ( );
        }
    }
}
