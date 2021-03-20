package htpatterns.strategy;

/**
 * Утка приманка.
 */
public class ModelDuck extends Duck {
    /**
     * В конструкторе происходит создание объекта с конкретными свойствами.
     */
    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // не может летать
        quackBehavior = new Quack(); // может крякать
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
