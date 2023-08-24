package ru.practice.schildt.ex10;

public class ThrowDemo {
    /**
     * Демонстрация применения оператора throw
     */
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение сгенерировано в теле" +
                    "метода demoproc()");
            throw e; // повторно сгенерировать исключение
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
