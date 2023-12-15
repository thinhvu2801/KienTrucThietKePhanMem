package behavioral.template_method.coffeeBeverage;

public abstract class CaffeineBeverage {
    public abstract void brew();
    public abstract void addCondiment();
    public void boilWater(){
        System.out.println("Đun sôi nước ở 100 độ C");
    }
    public void pourInCup(){
        System.out.println("Rót đồ uống ra cốc");
    }
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }
}