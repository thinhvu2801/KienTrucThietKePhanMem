package structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage{
    //thay ten bien compoment = beverage cho de hieu
    //ve ban chat beverage o lop con la compoment

    Beverage beverage;
    public CondimentDecorator(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription();
    }

}
