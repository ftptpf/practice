package htpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Добавляем новых наблюдателей в конец списка.
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Удаляем наблюдателя из списка, предварительно проверяем что список не пуст.
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    /**
     * Оповещение наблюдателей об изменении состояния через метод update реализуемый всеми наблюдателями.
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Оповещение наблюдателей о появлении новых данных.
     */
    private void measurementsChanged() {
        notifyObservers();
    }

    /**
     * В качестве теста устанавливаем данные.
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
 }
