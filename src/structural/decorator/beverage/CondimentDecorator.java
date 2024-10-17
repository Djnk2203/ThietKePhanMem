package structural.decorator.beverage;

public class CondimentDecorator extends beverage{
    beverage component;

    public CondimentDecorator(String description, structural.decorator.beverage.beverage component) {
        super(description);
        this.component = this.component;
    }

    public CondimentDecorator(String description) {
        super(description);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ","+ this.description;
    }

    @Override
    public int cost() {
        return component.cost();
    }
}
