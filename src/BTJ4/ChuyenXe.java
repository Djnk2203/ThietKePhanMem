package BTJ4;

public class ChuyenXe {
    public String maSoChuyen;
    public String hoTenTaiXe;
    public String soXe;
    public Double doanhThu;

    public ChuyenXe(String maSoChuyen, Double doanhThu, String soXe, String hoTenTaiXe) {
        this.maSoChuyen = maSoChuyen;
        this.doanhThu = doanhThu;
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public Double getDoanhThu() {
        return doanhThu;
    }

    public void inThongTin() {
        System.out.println("Ma so chuyen: " + maSoChuyen);
        System.out.println("So xe: " + soXe);
        System.out.println("Ho ten tai xe: " + hoTenTaiXe);
        System.out.println("Doanh thu: " + doanhThu);
   }
}
