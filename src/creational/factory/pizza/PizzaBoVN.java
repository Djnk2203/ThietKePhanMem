package creational.factory.pizza;

public class PizzaBoVN extends Pizza{
    @Override
    public void prepare() {
        System.out.println("1 con bo");
    }

    @Override
    public void bake() {
        System.out.println("nuong 15p");

    }

    @Override
    public void cut() {
        System.out.println("cat thanh khuc bu");

    }

    @Override
    public void box() {
        System.out.println("dong thung xop");
    }
}
