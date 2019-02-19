package actionmodel.state.train;

public class StartState extends SpeedAbstractState {
    //覆盖父类的抽象方法
    @Override
    public void Run(Train train) {
        if (0 == train.getSpeed ( )) {
            System.out.println ("当前时速为：" + train.getSpeed ( ) + "，列车正在启动。");
        } else {
            train.setState (new FastState ( ));
            train.Run ( );
        }
    }
}
