package creational.factory;

public class PizzaHaiSanVN extends Pizza{
    @Override
    public void prepare() {
        description.append("Chuẩn bị 4 con tôm\n");
    }

    @Override
    public void bake() {
        description.append("Nứng trong lò 20p\n");
    }

    @Override
    public void cut() {
        description.append("Cắt làm 4 miếng\n");
    }

    @Override
    public void box() {
        description.append("Bỏ vô hộp\nBon apettit :D");
    }
}
