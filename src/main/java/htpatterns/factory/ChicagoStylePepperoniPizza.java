package htpatterns.factory;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
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
