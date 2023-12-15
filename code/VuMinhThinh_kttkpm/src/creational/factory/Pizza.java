package creational.factory;

public abstract class Pizza {
    protected StringBuilder description= new StringBuilder();
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    @Override
    public String toString() {
        return description.toString();
    }
}
