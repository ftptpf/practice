package htpatterns.singleton;

/**
 * Нагреватель шоколадной смеси.
 */
public class ChocolateBoiler {
    private boolean empty; // пустой бак
    private boolean boiled; // закипел
    private static ChocolateBoiler uniqueInstance; // реализуем петтерн одиночка

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * В этом методе реализуем паттерн одиночка.
     * @return
     */
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = true;
            boiled = false;
            // далее заполняем емкость
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // сливаем нагретую смесь
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // доводим смесь до кипения
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
