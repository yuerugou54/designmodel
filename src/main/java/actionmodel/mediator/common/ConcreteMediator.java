package actionmodel.mediator.common;

/**
 * 具体的中介者
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    @Override
    //转发消息给同事，中介者模式的核心方法，通过这个方法将消息发送给其他人。
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.getMessage (message);
        } else {
            colleagueA.getMessage (message);
        }
    }

    //设定同事A
    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    //设定同事B
    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
