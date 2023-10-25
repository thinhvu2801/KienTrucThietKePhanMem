package bt_TH.structurePattern.B1;

public class BieuThucDonGian extends BieuThuc{
    float toanHang;
    public BieuThucDonGian(float toanHang){
        this.toanHang = toanHang;
    }
    @Override
    public float giaTri() {
        return toanHang;
    }
    public String bieuThuc(){
        return String.valueOf(toanHang);
    }
}
