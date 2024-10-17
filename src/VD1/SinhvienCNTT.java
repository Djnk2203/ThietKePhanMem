package VD1;

public class SinhvienCNTT {
    private String sinhvien;
    private String ten, queQuan;
    int tuoi;

    public SinhvienCNTT( String ten, int tuoi, String queQuan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.queQuan = queQuan;

    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }




    @Override
    public String toString() {
        return "Sinhvien: " +

                " ten:" + ten  +
                ", queQuan:" + queQuan +
                ", tuoi:" + tuoi ;
    }
}
