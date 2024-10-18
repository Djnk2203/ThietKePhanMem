package builder.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;

    public HoaDon(Builder builder) {
        this.header = builder.header;
        this.cthds = builder.cthds;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(header.toString()).append("\n");
        for (CTHD cthd : cthds) {
            sb.append(cthd.toString()).append("\n");
        }
        return sb.toString();
    }

    public static class Builder{
        HoaDonHeader header;
        private List<CTHD> cthds = new ArrayList<>();

        public Builder setHeader(String maHD, String ngayBan, String tenKH) {
            this.header = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }

        public Builder addCTHD(String sp, int sl, int gia) {
            this.cthds.add(new CTHD (sp, sl, gia));
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
