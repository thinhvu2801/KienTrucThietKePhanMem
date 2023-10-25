package creational.builder.computer;

public class MainComputer {
    public static void main(String[] args) {
        computer pc = new computer.Builder()
                .addCPU("I5")
                .addRAM("DDR5 6480")
                .addScreen("24 inch RBG 360Hz")
                .addStorage("2TB NVMe5 Samsung")
                .Build();
        System.out.println(pc.toString());
    }
}

