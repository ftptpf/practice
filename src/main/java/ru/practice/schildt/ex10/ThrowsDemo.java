package ru.practice.schildt.ex10;

public class ThrowsDemo {
    /**
     * Демонстрация работы throws.
     * @throws IllegalAccessException
     */
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne(). ");
        throw new IllegalAccessException("демонстрация");
    }
    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
