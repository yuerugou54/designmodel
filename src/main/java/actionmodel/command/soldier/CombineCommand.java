package actionmodel.command.soldier;

public class CombineCommand extends Command {
    public CombineCommand(Soliders soliders) {
        super (soliders);
    }

    @Override
    public void executeCommand() {
        soliders.combine ( );
    }
}
