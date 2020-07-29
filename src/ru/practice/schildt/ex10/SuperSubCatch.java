package ru.practice.schildt.ex10;

public class SuperSubCatch {
    /**
     * Это класс содержит ошибку.
     * В последовательности операторов catch
     * подкласс дожен быть указан перед суперклассом.
     * @param args
     */
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Этот код недостижим");
        } catch (Exception e) {
            System.out.println( "Перехват исключения общего класса Exception");
        }
    }
}
