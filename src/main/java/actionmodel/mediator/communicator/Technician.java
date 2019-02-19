package actionmodel.mediator.communicator;

public class Technician extends AbstractCustomer {
    public Technician(CustomerServer customerServer) {
        super (customerServer);
    }

    //调用中介者的communicate方法
    public void answer(String message) {
        customerServer.communicate (message, this);
    }

    public void getMessage(String message) {
        System.out.println ("顾客咨询技术人员：" + message);
    }
}
