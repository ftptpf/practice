package ru.practice.schildt.ex10;

public class MyException extends Exception{
    /**
     * Пример создания исключения MyException.
     */
    private int detail;

    MyException(int a){
        detail = a;
    }

    public String toString() {
        return "MyExceptin [" + detail + "]";
    }
}
class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызов метода compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Норальное завершение.");
    }
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
