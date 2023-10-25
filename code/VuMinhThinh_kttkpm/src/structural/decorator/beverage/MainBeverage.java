package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend("Cà phê Trung Nguyên House Blend ");
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription());
        System.out.printf("Giá: "+ houseBlend.cost());
    }


}
