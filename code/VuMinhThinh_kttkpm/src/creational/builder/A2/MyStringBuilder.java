package creational.builder.A2;

public class MyStringBuilder {
    private String s="";
    public MyStringBuilder addString(String sub){
        s +=sub;
        return this;
    }
    public MyStringBuilder addFloat(double f) {
        s+= f;
        return this;
    }
    public MyStringBuilder addBool(boolean b) {
        s+=b;
        return this;
    }

    @Override
    public String toString() {
        return s.toString();
    }
}