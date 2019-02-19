package actionmodel.command.common;

/**
 * 执行B命令
 */
public class ConcreteCommandB extends Command{
    public ConcreteCommandB(Receiver receiver) {
        super (receiver);
    }

    @Override
    public void execute() {
        receiver.actionB( );
    }
}
