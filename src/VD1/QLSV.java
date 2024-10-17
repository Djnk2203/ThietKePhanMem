package VD1;

import java.util.ArrayList;
import java.util.List;

public class QLSV implements IQLSV{
    List<SinhvienCNTT> list = new ArrayList<>();
    @Override
    public void add(SinhvienCNTT sv) {
        list.add(sv);
    }

    @Override
    public void print() {
        for (var sv : list) {
            System.out.println(sv.toString());
           
        }
    }
}
