package actionmodel.state.train;

public class TrainMain {
    public static void main(String[] args) {
        Train train = new Train ( );
        train.Run ( );

        //设置时速为100
        train.setSpeed (100);
        train.Run ( );

        train.setSpeed (150);
        train.Run ( );

        train.setSpeed (200);
        train.Run ( );

        train.setSpeed (250);
        train.Run ( );

        train.setGivenWay (true);
        train.Run ();
    }
}
