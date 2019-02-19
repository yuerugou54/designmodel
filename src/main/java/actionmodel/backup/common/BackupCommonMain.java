package actionmodel.backup.common;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象内部的状态，并在该对象之外保存这个状态，这样就可以在以后将该对象恢复到原先保存的状态。
 */
public class BackupCommonMain {
    public static void main(String[] args) {
        Originator originator = new Originator ( );
        originator.setState ("start");
        originator.setLevel ("0");
        originator.show ( );

        Caretaker caretaker = new Caretaker ( );
        caretaker.setMemento (originator.createMemento ( ));

        originator.setState ("stop");
        originator.setLevel ("1");
        originator.show ( );

        originator.setMemento (caretaker.getMemento ( ));
        originator.show ( );
    }
}
