package creational.factory;

public class VNPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type) {
            case HAI_SAN -> {
                return new PizzaHaiSanVN();
            }
        }
        return null;
    }
}
