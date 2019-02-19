package actionmodel.command.common;

/**
 * A命令
 */
public class ConcreteCommandA extends Command {
    public ConcreteCommandA(Receiver receiver) {
        super (receiver);
    }

    @Override
    public void execute() {
        receiver.actionA( );
    }
}
