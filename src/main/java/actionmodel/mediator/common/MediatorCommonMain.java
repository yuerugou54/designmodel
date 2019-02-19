package actionmodel.mediator.common;

/**
 * 中介模式：用一个中介对象来封装 一系列的对象交互。中介者使各个对象不需要显示的交互引用，从而使其耦合松散，而且可以独立的改变他们之间的交互
 * 可以类比观察者模式。观察者模式是把一个主题的变化通知给各个观察者。
 */
public class MediatorCommonMain {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator=new ConcreteMediator ();

        //将中介者插入到需要中介的类中
        ConcreteColleagueA concreteColleagueA=new ConcreteColleagueA (concreteMediator);
        ConcreteColleagueB concreteColleagueB=new ConcreteColleagueB (concreteMediator);

        //象中介者中注册用户
        concreteMediator.setColleagueA (concreteColleagueA);
        concreteMediator.setColleagueB (concreteColleagueB);

        concreteColleagueA.send ("喝了两瓶，我是同事A");
        concreteColleagueB.send ("我不喝酒，我是同事B");
    }
}
