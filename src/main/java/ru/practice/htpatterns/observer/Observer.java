package ru.practice.htpatterns.observer;

/**
 * Интерфейс наблюдателя.
 * В методе update передаются данные состояния от субъекта:
 * температура, влажность, давление.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
