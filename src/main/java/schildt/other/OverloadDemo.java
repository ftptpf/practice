package main.java.schildt.other;

public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }
    void test(int a) {
        System.out.println("a: " + a);
    }
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    void test(double a) {
        System.out.println("a: " + a);
    }
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;
        od.test();
        od.test(10);
        od.test(123.35);
        od.test(10, 20);
    }
}
