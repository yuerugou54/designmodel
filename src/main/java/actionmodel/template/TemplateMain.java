package actionmodel.template;

/**
 * 模板模式
 * 即将公用的方法集中在抽象的父类中，将一些步骤延迟在子类中进行实现。在父类中定义一个完成事情的总方法，按照完成事件所需要的步骤去调用每个具体的实现方法。每个步骤的具体实现由子类进行定义。
 *
 */
public class TemplateMain {

    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA ( );
        concreteClassA.templateMethod ( );
        ConcreteClassB concreteClassB = new ConcreteClassB ( );
        concreteClassB.templateMethod ( );
    }
}
