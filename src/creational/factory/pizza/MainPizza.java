package creational.factory.pizza;

import creational.factory.pizza.VN_PizzaStore;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore store = new VN_PizzaStore();
        Pizza p = store.orderPizza(PizzaType.BO);
        System.out.println(p.toString());

    }
}
