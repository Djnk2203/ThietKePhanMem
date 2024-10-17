package structural.decorator.beverage;

public class Milk extends CondimentDecorator{
    public Milk(String description, beverage component) {
        super(description, component);
    }

    @Override
    public int cost() {
        return super.cost()+5;
    }
}
