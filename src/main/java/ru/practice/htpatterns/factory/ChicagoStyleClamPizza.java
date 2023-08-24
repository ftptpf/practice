package ru.practice.htpatterns.factory;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "test...";
        dough = "test...";
        sauce = "test...";

        toppings.add("test...");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
