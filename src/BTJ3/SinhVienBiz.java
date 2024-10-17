package BTJ3;

public class SinhVienBiz extends SinhVienNTU{
    public float diemMarketing,diemSales;

    public SinhVienBiz(String hoTen, String nganh, float diemMarketing, float diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiemTB() {
        return (diemMarketing*2+diemSales)/3;
    }
}
