package actionmodel.mediator.common;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super (mediator);
    }

    @Override
    public void send(String message) {
        mediator.send (message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println ("colleague B　got a message:" + message);
    }
}
