package actionmodel.strategy;

public class ConcreteStrategyB extends Strategy {

    //覆盖父类的抽象方法
    @Override
    public void Algorithm() {
        System.out.println ("The operation of strategy is B");
    }
}
