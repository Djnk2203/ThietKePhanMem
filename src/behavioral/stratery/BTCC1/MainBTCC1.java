package behavioral.stratery.BTCC1;

public class MainBTCC1 {
    public static void main(String[] args) {
        Context context = new Context();
        float res;// tao 1 bien
        context.setTinhToan(new Cong() );
        res = context.tinh(10,3);
        System.out.println("10 + 3 = " + res);

        context.setTinhToan(new Tru() );
        res = context.tinh(10,3);
        System.out.println("10 - 3 = " + res);

        context.setTinhToan(new Nhan());
        res = context.tinh(10,3);
        System.out.println("10 * 3 = " + res);

        context.setTinhToan(new Chia());
        res = context.tinh(10,3);
        System.out.println("10 / 3 = " + res);
    }
}
