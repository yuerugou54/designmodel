package actionmodel.observe.common;

public class CommonObserveMain {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject ( );
        concreteSubject.attach (new ConcentrateObserver (concreteSubject, "1号观察者"));
        concreteSubject.attach (new ConcentrateObserver (concreteSubject, "2号观察者"));
        concreteSubject.attach (new ConcentrateObserver (concreteSubject, "3号观察者"));
        concreteSubject.setState ("Flying");
        concreteSubject.notifyUpdate ( );
    }

}
