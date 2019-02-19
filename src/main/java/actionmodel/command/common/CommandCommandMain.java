package actionmodel.command.common;

/**
 * 命令模式：将一个请求封装成一个对象，从而使用户可以用不同的请求对客户进行参数化；对请求排队或记录请求日志，并支持可撤销的操作。
 */
public class CommandCommandMain {

    public static void main(String[] args) {
        Receiver receiver = new Receiver ( );
        Command command = new ConcreteCommandA (receiver);
        Invoker invoker = new Invoker ( );

        invoker.setCommand (command);
        invoker.executeCommand ( );

        invoker.setCommand (new ConcreteCommandB (receiver));
        invoker.executeCommand ();
    }
}
