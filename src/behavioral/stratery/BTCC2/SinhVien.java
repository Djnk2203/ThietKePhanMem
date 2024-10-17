package behavioral.stratery.BTCC2;

import java.util.Date;

public class SinhVien {
    public String hoTen;
    public Date ngaySinh;
    public float diemTB;

    public SinhVien(String hoTen, float diemTB, Date ngaySinh) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
}
