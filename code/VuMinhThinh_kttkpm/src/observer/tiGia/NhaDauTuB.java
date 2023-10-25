package observer.tiGia;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{

    TiGia  tiGia;

    public NhaDauTuB(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }

    public void huyDangKi(){
        tiGia.detach(this);
    }
    @Override
    public void capNhat(float delta){
        if(delta>0)
            System.out.println("Nhà đầu tu B: Bán ra");
        else System.out.println("Nhà đầu tu B: Mua vào");
    }
}
