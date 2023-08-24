package ru.practice.htpatterns.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Абстрактный класс пиццы.
 */
public abstract class Pizza {
    String name; // название
    String dough; // тесто
    String sauce; //  соус
    List<String> toppings = new ArrayList<>(); // начинки

    /**
     * Метод подготовки пиццы.
     */
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }

    }

    /**
     * Метод выпекания пиццы.
     */
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * Метод резки пиццы.
     */
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * Метод упаковки пиццы.
     */
    void box() {
        System.out.println("Pace pizza into official PizzaStoreBox");
    }

    public String getName() {
        return name;
    }
}
