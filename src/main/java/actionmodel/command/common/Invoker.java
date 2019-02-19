package actionmodel.command.common;

/**
 * 命令传达类
 */
public class Invoker {
    private Command command;

    //注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void executeCommand() {
        command.execute ( );
    }
}

