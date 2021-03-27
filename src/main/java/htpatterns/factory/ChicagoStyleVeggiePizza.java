package htpatterns.factory;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
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
