package builder.A1;

public class HoaDonHeader {
    private String maHD;
    private String ngayBan;
    private String tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    // Các phương thức getter
    public String getMaHD() { return maHD; }
    public String getNgayBan() { return ngayBan; }
    public String getTenKH() { return tenKH; }


    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "maHD='" + maHD + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", tenKH='" + tenKH + '\'' +
                '}';
    }
}
