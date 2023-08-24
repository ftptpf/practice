package ru.practice.htpatterns.strategy;

/**
 * Реализация когда утка может крякать.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
