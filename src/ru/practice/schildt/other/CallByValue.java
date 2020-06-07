package ru.practice.schildt.other;

public class CallByValue {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        Test ob = new Test(a, b);
        System.out.println("a и b до вызова : " + a + " " + b);
        ob.meth(a,b);
        System.out.println("a и b после вызова : " + a + " " + b);
    }
}
