package actionmodel.mediator.communicator;

//抽象的交流者
public abstract class AbstractCustomer {
    protected CustomerServer customerServer;

    //构造函数
    public AbstractCustomer(CustomerServer customerServer) {
        this.customerServer = customerServer;
    }
}
