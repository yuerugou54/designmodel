package actionmodel.mediator.communicator;

public abstract class CustomerServer {
    //抽象的沟通方法
    public abstract void communicate(String message, AbstractCustomer communicator);
}
