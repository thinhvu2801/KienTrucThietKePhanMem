package structural.decorator.B2;

public class TachTu implements ITokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }
    @Override
    public String[] tokenize(){
        return s.split(" ");
    }
}
