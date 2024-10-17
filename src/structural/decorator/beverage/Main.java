package structural.decorator.beverage;

public class Main {
    public static void main(String[] args) {
        beverage b = new HouseBlend("Cafe cuc chon");
        b = new Milk("Co gai HaLan",b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        
    }
}
