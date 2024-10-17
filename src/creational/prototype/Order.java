package creational.prototype;

import java.util.List;

public class Order extends Prototype{
    String id, tenKH;
    List<Product> products;

    @Override
    public Order copy() {
        return (Order) super.copy();
    }

    @Override
    public Order clone() {
        return (Order) super.clone();
    }
}
