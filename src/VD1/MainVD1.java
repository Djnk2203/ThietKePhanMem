package VD1;

import java.util.Scanner;

public class MainVD1 {
    public static void main(String[] args) {
//        var sv = new SinhvienCNTT("dinh",23,"nha trang");
//        System.out.println(sv);
//        var sv2 = new SinhvienCNTT_CLC("Bao",22,"khanh hoa","x2");
//        System.out.println(sv2);
        IQLSV qlsv = new QLSV();
        qlsv.add(new SinhvienCNTT("mai",33,"nha trang"));
        qlsv.add(new SinhvienCNTT("ma",3,"nha trang"));
        qlsv.add(new SinhvienCNTT("manh",32,"nha trang"));
        qlsv.print();
    }
}
