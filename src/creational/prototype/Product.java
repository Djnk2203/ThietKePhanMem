package creational.prototype;

public class Product extends Prototype{
    String ten;
    int gia;
    public Product(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public Product copy() {
        return (Product) super.copy();
    }

    @Override
    public Product clone() {
        return (Product) super.clone();
    }

}
