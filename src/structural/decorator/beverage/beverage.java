package structural.decorator.beverage;

public abstract class beverage {
    String description;
    public beverage(String description) {
        this.description = description;
    }

    public abstract int cost();
    public String getDescription() {
        return description;
    }
}
