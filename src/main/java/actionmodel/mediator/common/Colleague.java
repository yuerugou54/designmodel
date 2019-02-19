package actionmodel.mediator.common;

//抽象同事类
public abstract class Colleague {
    protected Mediator mediator;

    //构造函数
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void getMessage(String message);
}
