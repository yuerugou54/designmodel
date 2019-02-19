package actionmodel.command.soldier;

//将所有的命令单独提取为对象
public class CableBoatCommand extends Command {
    @Override
    public void executeCommand() {
        soliders.cableBoat ( );
    }

    public CableBoatCommand(Soliders soliders) {
        super (soliders);
    }
}
