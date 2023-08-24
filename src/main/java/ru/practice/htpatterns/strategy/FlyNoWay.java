package ru.practice.htpatterns.strategy;

/**
 * Реализация когда утка не может летать.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
