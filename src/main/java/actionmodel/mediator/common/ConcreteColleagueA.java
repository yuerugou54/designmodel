package actionmodel.mediator.common;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super (mediator);
    }

    //转发消息给同事A
    public void send(String message) {
        mediator.send (message, this);
    }

    //收消息
    public void getMessage(String message) {
        System.out.println ("colleague A　got a message:" + message);
    }
}
