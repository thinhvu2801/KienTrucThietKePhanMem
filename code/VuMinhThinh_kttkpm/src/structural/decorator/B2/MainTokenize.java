package structural.decorator.B2;

import java.util.Arrays;

public class MainTokenize {
    static void inKQ(String[] kq) {
        Arrays.stream(kq).forEach(s -> {
            System.out.println();
            System.out.println(s + "\t");
        });
    }

    public static void main(String[] args) {
        ITokenize tachTu = new TachTu("Hôm nay trời mưa vãi, mún nghỉ học thì Hôm sau nghỉ tiếp !");
        inKQ(tachTu.tokenize());

        ITokenize boDauCau = new LoaiBoDauCau(tachTu);
        ITokenize boTuDung = new LoaiBoTuDung(boDauCau);
        System.out.println("Loại bỏ dấu câu, từ dừng:");
        inKQ(boTuDung.tokenize());

    }
}