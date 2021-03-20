package htpatterns.strategy;

/**
 * Создание абстрактного класса утки.
 */
public abstract class Duck {
    FlyBehavior flyBehavior; // ссылочная переменная с типом интерфейса поведения при полете
    QuackBehavior quackBehavior; // ссылочная переменная с типом интерфейса поведения при крякании

    public Duck() {
    }
    public abstract void display(); // абстрактный метод который должен будет реализован во всех наследниках

    public void performFly() { // деллегирование операции полета классам поведения
        flyBehavior.fly();
    }

    public void performQuack() { // делелгирование операции крякания классам поведения
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) { // метод установки полета утки
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) { // метод установки крякания утки
        quackBehavior = qb;
    }

    public void swim() { // метод плавания утки
        System.out.println("All ducks float, even decoys!");
    }
}
