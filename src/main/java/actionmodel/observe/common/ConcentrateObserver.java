package actionmodel.observe.common;

public class ConcentrateObserver extends Observer {
    private String observeName;
    private String state;
    private ConcreteSubject concreteSubject;

    //得到具体的主题
    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }


    //含参数的构造方法
    public ConcentrateObserver(ConcreteSubject concreteSubject, String observeName) {
        this.concreteSubject = concreteSubject;
        this.observeName = observeName;
    }

    @Override
    public void update() {
        state = concreteSubject.getState ( );
        System.out.println (observeName + "观察到的状态是：" + state);
    }
}
