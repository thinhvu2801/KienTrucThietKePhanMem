package bt_TH.builderPattern.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header ;
    private ArrayList<CTHD> cthds;
    public HoaDon(Builder builder){
        this.header = builder.header;
        this.cthds = builder.cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append( "Thong tin hoa don:\n" + header.toString());
        for(CTHD cthd : cthds){
            builder.append("\n").append(cthd.toString());
        }
        return builder.toString();
    }


    public static class Builder{
        private HoaDonHeader header = new HoaDonHeader();
        private ArrayList<CTHD> cthds = new ArrayList<>();
        public Builder addHeader(String maHD, String ngayBan, String tenKH){
            header = new HoaDonHeader(maHD, tenKH, ngayBan);
            return this;

        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, double chietKhau){
            cthds.add(new CTHD(sanPham,soLuong,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }

}
