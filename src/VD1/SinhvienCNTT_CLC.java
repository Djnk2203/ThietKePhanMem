package VD1;

public class SinhvienCNTT_CLC extends SinhvienCNTT{
    private String hocPhi;

    public SinhvienCNTT_CLC(String ten, int tuoi, String queQuan, String hocPhi) {
        super(ten, tuoi, queQuan);
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoc Phi: " + hocPhi;
    }
}
