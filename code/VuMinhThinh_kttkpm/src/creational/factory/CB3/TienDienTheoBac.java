package creational.factory.CB3;

public class TienDienTheoBac implements TinhTienDienBacThang {
    int min, max;
    int gia;
    TinhTienDienBacThang keTiep;

    public TienDienTheoBac(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    @Override
    public TinhTienDienBacThang bacKeTiep(TinhTienDienBacThang keTiep){
        this.keTiep= keTiep;
        return this.keTiep;
    }
    @Override
    public int tinhTienDien(int soKw){
        if (soKw <= max)
            return (soKw-min)*gia;
        return (max-min)*gia +keTiep.tinhTienDien(soKw);
    }
}
