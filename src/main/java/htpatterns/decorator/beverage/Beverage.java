package htpatterns.decorator.beverage;

/**
 * Абстрактный класс напитка.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
