package BTJ3;

public class SinhVienIT extends SinhVienNTU {

    public float diemJava,diemCSS,diemHTML;

    public SinhVienIT(String hoTen, String nganh, float diemJava, float diemHTML, float diemCSS) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    @Override
    public double getDiemTB() {
        return (diemJava*2+diemHTML+diemCSS)/4;
    }

}
