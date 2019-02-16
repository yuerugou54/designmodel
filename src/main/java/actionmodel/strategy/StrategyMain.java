package actionmodel.strategy;

/**
 * 策略模式
 * 定义了算法家族，分别进行封装，让他们之间可以互相替换，这种模式使得算法的变化不会影响使用算法的用户
 * 策略模式使用相同的调用来使用所有的算法，降低了算法类与使用算法的类之间的耦合
 */
public class StrategyMain {
    static Context context;

    public static void main(String[] args) {
        context = new Context (new ConcreteStrategyA ( ));
        context.contextOperation ( );
        context = new Context (new ConcreteStrategyB ( ));
        context.contextOperation ( );
        context = new Context (new ConcreteStrategyC ( ));
        context.contextOperation ( );

        context = new ContextExtend (1);
        context.contextOperation ( );
    }
}
