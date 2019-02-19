package actionmodel.mediator.communicator;

/**
 * 中介模式，的核心是中介者，如果其职责过多将会导致系统繁杂，维护起来比较困难
 */
public class CommunicatorMain {
    public static void main(String[] args) {
        CustomerServiceMM csMM=new CustomerServiceMM ();

        Customer customer=new Customer (csMM);
        Technician technician=new Technician (csMM);

        //中介者中进行消息的转发逻辑实现
        csMM.setCustomer (customer);
        csMM.setTechnician (technician);

        //调用了中介者进行消息转发
        customer.ask ("我的手机无法上网！");
        //调用中介者将消息转发给咨询客户
        technician.answer ("手机么有开通流量功能额");
    }
}
