package behavioral.template_method.coffeeBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Ngâm túi lọc vào nước sôi 15p");
    }

    @Override
    public void addCondiment() {
        System.out.println("Cho sữa vào trà --> Trà sữa");
    }
}
