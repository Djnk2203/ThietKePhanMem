package behavioral.stratery.duck;

public class VitQuay extends Duck {

    @Override
    public void display() {
        System.out.println("Vit quay Bac Kinh");
        this.performFly();
        this.performQuack();
        this.swim();
    }
}
