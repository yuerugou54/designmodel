package actionmodel.strategy;

/**
 * 可扩展的策略模式
 * 结合简单工厂模式，将判断的代码集成在context中
 */
public class ContextExtend extends Context {

    public ContextExtend(int i) {
        switch (i) {
            case 1:
                this.strategy = new ConcreteStrategyA ( );
                break;
            case 2:
                this.strategy = new ConcreteStrategyB ( );
                break;
            default:
                this.strategy = new ConcreteStrategyC ( );
        }
    }
}
