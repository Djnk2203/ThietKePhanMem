package behavioral.stratery.duck;

public class MainDuck {
    public static void main(String[] args) {
        VitQuay vitQuay1 = new VitQuay();
        vitQuay1.setFlyBehaviour(new BayTrenThanHong());
        vitQuay1.setQuackBehavior(new VitQuayKeu());
        vitQuay1.display();

        VitQuay vitQuay2 = new VitQuay();
        vitQuay2.setQuackBehavior(new VitNoiKeu());
        vitQuay2.setFlyBehaviour(new BayTrongNoi());
        vitQuay2.display();
    }
}
