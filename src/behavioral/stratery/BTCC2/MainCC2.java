package behavioral.stratery.BTCC2;

public class MainCC2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();

//        // Tạo các đối tượng SinhVien
//        SinhVien sv1 = new SinhVien("Nguyen Van A", new Date(), 8.5f);
//        SinhVien sv2 = new SinhVien("Le Thi B", new Date(), 7.0f);
//        SinhVien sv3 = new SinhVien("Tran Van C", new Date(), 9.0f);
        // loi





        System.out.println("Sắp xếp theo tên:");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();


        System.out.println("\nSắp xếp theo điểm:");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}

