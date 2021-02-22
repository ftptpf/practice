package main.java.schildt.other;

public class TestStack {
    public static void main(String[] args) {
        main.java.schildt.other.Stack mystack1 = new main.java.schildt.other.Stack(3);
        main.java.schildt.other.Stack mystack2 = new main.java.schildt.other.Stack(3);
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        System.out.println("Содержимое стека mystack1: ");
        for (int i = 0; i < 10; i++ )
            System.out.println(mystack1.pop());
        System.out.println("Содержимое стека mystack2: ");
        for (int i = 0; i < 10; i++ )
            System.out.println(mystack2.pop());
    }
}