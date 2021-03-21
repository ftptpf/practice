package htpatterns.observer;

/**
 * Визуальное отображение информации.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * В конструкторе регистрируем наблюдателя в передаваемом субъекте.
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * Сохраняем значения температуры и влажности и вызываем метод display для вывода информации.
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    /**
     * Выводим на консоль текущие значения температуры и влажности.
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + " % humidity");
    }
}
