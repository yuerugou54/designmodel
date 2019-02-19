package actionmodel.command.soldier;

public abstract class Command {
    protected Soliders soliders;

    public Command(Soliders soliders) {
        this.soliders = soliders;
    }

    public abstract void executeCommand();
}
