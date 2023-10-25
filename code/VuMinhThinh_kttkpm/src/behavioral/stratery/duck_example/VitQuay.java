package behavioral.stratery.duck_example;

public class VitQuay extends Duck{
    @Override
    public void display() {
        System.out.println("Vịt quay");
        this.swim();
        this.performFly();
        this.performQuack();
    }
}
