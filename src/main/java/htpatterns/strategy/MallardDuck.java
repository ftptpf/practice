package htpatterns.strategy;

/**
 * Утка кряква.
 */
public class MallardDuck extends Duck {
    /**
     * В конструкторе происходит создание объекта с конкретными свойствами.
     */
    public MallardDuck() {
        flyBehavior = new FlyWithWings(); // может летать
        quackBehavior = new Quack(); // может крякать
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
