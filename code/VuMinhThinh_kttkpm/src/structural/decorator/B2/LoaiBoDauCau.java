package structural.decorator.B2;

import java.util.Arrays;
import java.util.List;

public class LoaiBoDauCau extends TokenizeDecorator {
    List<String> daus = Arrays.asList(",", ".", "?", "!", ";");

    public LoaiBoDauCau(ITokenize source) {
        super(source);
    }

    @Override
    public String[] tokenize() {
        String[] st = super.tokenize();
        for (int i = 0; i < st.length; i++) {
            String dau = st[i].substring(st[i].length() - 1);
            if (daus.contains(dau))
                st[i] = st[i].substring(0, st[i].length() - 1);
        }
        return st;
    }
}
