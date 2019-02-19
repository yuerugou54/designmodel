package actionmodel.observe.common;

import java.util.ArrayList;

/**
 * 抽象的通知类代码
 */
public abstract class Subject {
    private ArrayList<Observer> observerLst = new ArrayList<Observer> ( );

    //进入
    public void attach(Observer observer) {
        observerLst.add (observer);
    }

    //离开
    public void detach(Observer observer) {
        observerLst.remove (observer);
    }

    //通知
    public void notifyUpdate() {
        for (int i = 0; i < observerLst.size ( ); i++) {
            observerLst.get (i).update ( );
        }
    }
}
