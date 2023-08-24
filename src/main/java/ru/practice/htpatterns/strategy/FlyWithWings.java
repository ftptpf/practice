package ru.practice.htpatterns.strategy;

/**
 * Реализация полета утки с помощью крыльев.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!");
    }
}
