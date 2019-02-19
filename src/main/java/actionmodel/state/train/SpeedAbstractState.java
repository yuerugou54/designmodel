package actionmodel.state.train;

//当需要在context中保存对象的状态时，需要使用抽象类而非接口来进行
public abstract class SpeedAbstractState {
    public abstract void Run(Train train);
}
