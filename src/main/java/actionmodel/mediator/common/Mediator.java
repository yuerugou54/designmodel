package actionmodel.mediator.common;

public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
