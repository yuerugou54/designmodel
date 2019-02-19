package actionmodel.mediator.communicator;

public class CustomerServiceMM extends CustomerServer {
    private Customer customer;
    private Technician technician;

    @Override
    //客服沟通小妹，是一个中介者。将顾客和技术人员的消息进行转发
    public void communicate(String message, AbstractCustomer communicator) {
        if (communicator == customer) {
            technician.getMessage (message);
        } else {
            customer.getMessage (message);
        }
    }

    //注册客服人员
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //注册技术人员
    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
}
