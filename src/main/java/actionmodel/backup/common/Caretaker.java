package actionmodel.backup.common;

public class Caretaker {
    private Memento memento;

    //设定备忘
    public void setMemento(Memento memento){
        this.memento=memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
