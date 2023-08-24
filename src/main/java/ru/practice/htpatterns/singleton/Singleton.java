package ru.practice.htpatterns.singleton;

/**
 * В классе выполняем проверку на синхронизацию чтобы гарантировать создание единственного экземпляра.
 */

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
