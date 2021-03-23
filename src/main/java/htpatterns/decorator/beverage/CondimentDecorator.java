package htpatterns.decorator.beverage;

/**
 * Абстрактный класс дополнений к напиткам.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription(); // заново реализуем метод из Beverage
}
