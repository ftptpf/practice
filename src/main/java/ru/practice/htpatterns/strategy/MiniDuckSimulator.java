package ru.practice.htpatterns.strategy;

/**
 * Тестовый класс для проверки работы паттерна стратегия на примере "утки"
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck(); // создаем объект "утка кряква"
        mallard.performQuack(); // вызываем метод крякания
        mallard.performFly(); // вызываем метод полета

        Duck model = new ModelDuck(); // создает объект утка приманка
        model.performFly();// вызываем метод полета
        model.setFlyBehavior(new FlyRocketPowered()); // присваиваем новый метод полета
        model.performFly(); // повторно вызываем метод полета
    }
}
