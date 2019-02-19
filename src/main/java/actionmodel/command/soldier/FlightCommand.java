package actionmodel.command.soldier;

public class FlightCommand extends Command {
    @Override
    public void executeCommand() {
        soliders.flight ( );
    }

    public FlightCommand(Soliders soliders) {
        super (soliders);
    }
}
