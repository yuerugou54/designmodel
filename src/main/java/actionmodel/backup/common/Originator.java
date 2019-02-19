package actionmodel.backup.common;

/**
 * 这是需要进行备份的对象
 */
public class Originator {
    private String state;
    private String level;

    //建立状态存储对象
    public Memento createMemento() {
        return (new Memento (state, level));
    }

    //设置状态存储对象
    public void setMemento(Memento memento) {
        state = memento.getState ( );
        level = memento.getLevel ( );
    }

    //展示状态
    public void show() {
        System.out.println ("状态为：" + state + ",等级为：" + level);
    }

    //获取状态
    public String getState() {
        return state;
    }

    //设置状态
    public void setState(String state) {
        this.state = state;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
