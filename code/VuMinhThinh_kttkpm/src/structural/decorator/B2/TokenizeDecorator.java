package structural.decorator.B2;

public abstract class TokenizeDecorator implements ITokenize {
    ITokenize source;
    public TokenizeDecorator(ITokenize source){
        this.source=source;
    }

    @Override
    public String[] tokenize() {
        return source.tokenize();
    }
}