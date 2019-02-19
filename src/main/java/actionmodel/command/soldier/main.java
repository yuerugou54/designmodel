package actionmodel.command.soldier;

public class main {
    public static void main(String[] args) {
        Soliders soliders = new Soliders ( );
        Command combine = new CombineCommand (soliders);
        Command flight = new FlightCommand (soliders);
        Command cable = new CableBoatCommand (soliders);

        //设置传令官
        Herald herald = new Herald ( );
        herald.setCommand (combine);
        herald.notifyCommand ( );

        herald.setCommand (flight);
        herald.notifyCommand ( );

        herald.setCommand (cable);
        herald.notifyCommand ( );
    }
}
