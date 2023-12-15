package creational.factory;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore vn = new VNPizzaStore();
        Pizza p1 = vn.orderPizza(PizzaType.HAI_SAN);
        System.out.println(p1.toString());
    }
}
