package ru.practice.schildt.ex10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println("Полсе оператора catch");
    }
}
