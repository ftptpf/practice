package ru.practice.htpatterns.decorator.beverage;

/**
 * Тестовый класс для проверки паттерна "Декоратор".
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1); // добавляем один ингредиент "шоколад"
        beverage1 = new Mocha(beverage1); // добавляем второй ингредиент "шоколад"
        beverage1 = new Whip(beverage1); // добавляем третий ингредиент "взбитые сливки"
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2); // добавляем один ингредиент "соя"
        beverage2 = new Mocha(beverage2); // добавляем второй ингредиент "шоколад"
        beverage2 = new Whip(beverage2); // добавляем третий ингредиент "взбитые сливки"
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
