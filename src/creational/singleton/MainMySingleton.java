package creational.singleton;

public class MainMySingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();//do s2 voi s1 chung bien getInstance
        s1.countPrint();//1
        s1.countPrint();//2
        s2.countPrint();//3
        s1.countPrint();//4
    }
}
