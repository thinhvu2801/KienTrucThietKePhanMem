package observer.tiGia;

public class NhaDauTuA implements TiGia.I_TheoDoiTiGia{

    TiGia  tiGia;

    public NhaDauTuA(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }

    public void huyDangKi(){
        tiGia.detach(this);
    }
    @Override
    public void capNhat(float delta){
        if(delta>0)
            System.out.println("Nhà đầu tu A: Bán ra");
        else System.out.println("Nhà đầu tu A: Mua vào");
    }
}
