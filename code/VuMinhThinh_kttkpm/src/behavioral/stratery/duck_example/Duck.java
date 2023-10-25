package behavioral.stratery.duck_example;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void display();
    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
    public void swim(){
        System.out.println("Vịt bơi ọc ọc ọc");
    }
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void performFly(){
        System.out.println(flyBehavior.fly());
    }
    void performQuack(){ System.out.println(quackBehavior.quack());}

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
