package actionmodel.state.train;

public class Train {
    private SpeedAbstractState currentState;

    public Train() {
        this.currentState = new StartState ( );
    }

    private Integer speed=0;

    private Boolean givenWay = false;

    //设置状态
    public void setState(SpeedAbstractState state) {
        currentState = state;
    }

    //获取火车速度
    public Integer getSpeed() {
        return speed;
    }

    //设置速度
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    //是否让行
    public Boolean isGiveWay() {
        return givenWay;
    }

    //设置让行
    public void setGivenWay(Boolean givenWay) {
        this.givenWay = givenWay;
    }

    //火车行驶
    public void Run() {
        currentState.Run (this);
    }
}
