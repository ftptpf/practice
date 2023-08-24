package ru.practice.htpatterns.observer;

/**
 * Интерфейс субъекта, от которого наблюдатели получают данные.
 */
public interface Subject {
    public void registerObserver(Observer o); // метод регистрации наблюдателя
    public void removeObserver(Observer o); // метод удаления наблюдателя из зарегистрированных
    public void notifyObservers(); // метод оповещения наблюдателей об изменении состоянии субъекта
}
