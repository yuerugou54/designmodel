package actionmodel.backup.common;

//备忘录负责存储待备忘的originator对象的内部状态，同时可以防止除originator以外的其他对象访问到自己
public class Memento {
    private String state;
    private String level;

    public Memento(String state, String level) {
        this.state = state;
        this.level = level;
    }

    public String getState() {
        return state;
    }

    public String getLevel() {
        return level;
    }
}
