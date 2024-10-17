package behavioral.stratery.BTCC2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLSV {
    List<SinhVien> svs = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    private Comparator<SinhVien> comparator;


    public void sapXep() {
        svs.sort((o1, o2) -> soSanh.soSanh(o1, o2));
    }
    public void sapXep2(){
        for(int i = 0; i < svs.size(); i++)
            for (int j = i + 1; j < svs.size(); i++){
                if(soSanh.soSanh(svs.get(i), svs.get(j))==1){
                    // Doi cho i, j
                    var s = svs.get(i);
                    svs.set(i, svs.get(j));
                    svs.set(j, s);
                }
            }
    }
//    public void sapXep3(){
//        svs.sort(Comparable);
//    }
// loi

    public void inDS() {
        svs.forEach((t) ->{
            System.out.println(t.toString());
        });
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    public List<SinhVien> getSvs() {
        return svs;
    }
    public void setComparator(Comparator<SinhVien> comparator) {
        this.comparator = comparator;
    }


    @Override
    public String toString() {
        return "QLSV{" +
                "svs=" + svs +
                ", soSanh=" + soSanh +
                ", comparator=" + comparator +
                '}';
    }
}
