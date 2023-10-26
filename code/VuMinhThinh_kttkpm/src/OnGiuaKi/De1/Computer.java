package OnGiuaKi.De1;

public class Computer {
    private String brand;
    private String model;
    private String cpu;
    private int ram;
    private int storage;
    private double screen;
    private double price;

    public Computer(String brand, String model, String cpu, int ram, int storage, double screen, double price) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Screen: " + screen + " inches");
        System.out.println("Price: $" + price);
        System.out.println("------------------------");
    }
}
