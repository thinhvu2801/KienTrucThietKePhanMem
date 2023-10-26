package OnGiuaKi.De1;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();

        Computer computer1 = builder.setBrand("Gaming").setModel("Model 1").setCpu("Intel i9")
                .setRam(16).setStorage(512).setScreen(15.6).setPrice(2000).build();

        Computer computer2 = builder.setBrand("Office").setModel("Model 2").setCpu("Intel i5")
                .setRam(8).setStorage(256).setScreen(14).setPrice(1000).build();

        Computer computer3 = builder.setBrand("Gaming").setModel("Model 3").setCpu("AMD Ryzen")
                .setRam(32).setStorage(1000).setScreen(17).setPrice(2500).build();

        ComputerCategory gamingCategory = new ComputerCategory("Gaming Computers");
        gamingCategory.addComputer(computer1);
        gamingCategory.addComputer(computer3);

        ComputerCategory officeCategory = new ComputerCategory("Office Computers");
        officeCategory.addComputer(computer2);

        gamingCategory.display();
        officeCategory.display();
    }
}
