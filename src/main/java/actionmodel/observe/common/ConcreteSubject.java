package actionmodel.observe.common;

//具体的主题
public class ConcreteSubject extends Subject {
    private  String state;

    //设置状态
    public void setState(String state){
        this.state=state;
    }

    //获取状态

    public String getState() {
        return state;
    }
}
