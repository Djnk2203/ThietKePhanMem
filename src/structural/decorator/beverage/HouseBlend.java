package structural.decorator.beverage;

public class HouseBlend extends beverage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 25000;
    }
}
