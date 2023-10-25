package structural.decorator.beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 8 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ Chocolate ";
    }
}