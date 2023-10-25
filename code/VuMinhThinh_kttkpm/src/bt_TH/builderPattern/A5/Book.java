package bt_TH.builderPattern.A5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuade;
    int sotrang;
    String tacgia;
    List<String> ds;
    public Book(Builder builder){
        this.tuade = builder.tuade;
        this.sotrang = builder.sotrang;
        this.tacgia = builder.tacgia;
        this.ds =builder.ds;
    }

    @Override
    public String toString() {
        return "Book" + "\nTua de: " + tuade + "\nSo trang: " + sotrang + "\nTac gia" + tacgia +"\nDanh sach chuong: " + ds;
    }

    public static class Builder{
        String tuade;
        int sotrang;
        String tacgia;
        List<String> ds = new ArrayList<>();
        public Builder settuade(String tuade){
            this.tuade = tuade;
            return this;
        }
        public Builder setsotrang(int sotrang){
            this.sotrang = sotrang;
            return this;
        }
        public Builder settacgia(String tacgia){
            this.tacgia = tacgia;
            return this;
        }
        public Builder addDSach(String n){
            ds.add(n);
            return this;
        }
        public Book builder(){
            return new Book(this);
        }

    }
}
