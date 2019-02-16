package actionmodel.state.watermachine;

/**
 *状态模式的地址:https://www.cnblogs.com/wenjiang/p/3352041.html
 * 核心思想是：当一个对象的内在状态改变时允许改变其行为，这个对象看起来就像是改变了其类
 * 本文以饮水机为例进行讲解，每一个状态类中都会带一个执行press的操作，该操作控制不同的状态下执行的不同的处理，将大量的if-else的嵌套分散到各个状态类中。
 */
public class WaterMain {
    public static void main(String[] args) {
        DispenserState dispenserState;
        dispenserState = new WaterFull ( );
        WaterMachine waterMachine = new WaterMachine (dispenserState);
        for (int i = 0; i < 100; i++) {
            waterMachine.press ( );
        }
    }
}
