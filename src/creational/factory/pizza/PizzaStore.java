package creational.factory.pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(PizzaType type);
    protected Pizza orderPizza(PizzaType type){
        Pizza p = createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
        return p;
    }
}
