package creational.builder.A2;


public class MainString {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();
        String result = builder
                .addString("Hello, ")
                .addString("world! \n")
                .addFloat(3.14)
                .addString("\n")
                .addBool(true)
                .toString();

        System.out.println(result);
    }
}
