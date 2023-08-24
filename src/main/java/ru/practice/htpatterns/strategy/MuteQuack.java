package ru.practice.htpatterns.strategy;

/**
 * Реализация когда утка не может крякать.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
