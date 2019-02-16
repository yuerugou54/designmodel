package actionmodel.template;

public abstract class AbstractClass {
    protected abstract void doSomeThing();

    protected abstract void doAnyThing();

    protected abstract void doEveryThing();

    //加上final防止重写
    public final void templateMethod() {
        doSomeThing ( );
        doAnyThing ( );
        doEveryThing ( );
    }
}
