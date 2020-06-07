package ru.practice.schildt.other;

public class OverloadCons {
    public static void main(String[] args) {
        Box box1 = new Box(10,20,15);
        Box box2 = new Box();
        Box box3 = new Box(7);
        double vol;
        vol = box1.volume();
        System.out.println("Объем box1 равен : " + vol);
        vol = box2.volume();
        System.out.println("Объем box2 равен : " + vol);
        vol = box3.volume();
        System.out.println("Объем box3 равен : " + vol);
    }
}
