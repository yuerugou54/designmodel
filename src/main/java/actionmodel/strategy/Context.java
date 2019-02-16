package actionmodel.strategy;

public class Context {
    Strategy strategy;

    //构造函数
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {
        System.out.println ("context 构造函数");
    }

    //上下文操作
    public void contextOperation() {
        this.strategy.Algorithm ( );
    }
}
