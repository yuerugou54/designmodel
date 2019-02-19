package actionmodel.mediator.communicator;

public class Customer extends AbstractCustomer {
    public Customer(CustomerServer customerServer) {
        super (customerServer);
    }

    //顾客提问
    public void ask(String message) {
        customerServer.communicate (message, this);
    }

    //顾客得到回复
    public void getMessage(String message) {
        System.out.println ("顾客得到咨询技术人员的回复：" + message);
    }
}
