package actionmodel.command.soldier;

public class Herald {
    private Command command;

    //接受命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //传令下去
    public void notifyCommand() {
        command.executeCommand ( );
    }
}
