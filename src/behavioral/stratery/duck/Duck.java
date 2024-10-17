package behavioral.stratery.duck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        System.out.println(flyBehaviour.fly());
    }
    public void performQuack() {
        System.out.println(quackBehavior.quack());
    }
    public void swim() {                          //ko quan tam boi kieu gi
        System.out.println("swim");
    }

    //gan gia tri setter
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
