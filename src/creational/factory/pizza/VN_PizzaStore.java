package creational.factory.pizza;

import creational.factory.pizza.PizzaBoVN;

public class VN_PizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type){
            case BO -> {
                return new PizzaBoVN();
            }
        }
        return null;
    }

}
