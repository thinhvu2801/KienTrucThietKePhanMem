package structural.decorator.B2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenizeDecorator {
    private static final String[] dsTuDung = {"và", "hoặc", "thì", "mà", "là"};

    public LoaiBoTuDung(ITokenize source) {
        super(source);
    }

    @Override
    public String[] tokenize() {
        ArrayList<String> dsTu = new ArrayList<>();
        dsTu.addAll(Arrays.asList(super.tokenize()));
        dsTu.removeAll(Arrays.asList(dsTuDung));
        return dsTu.toArray(new String[0]);
    }
}
