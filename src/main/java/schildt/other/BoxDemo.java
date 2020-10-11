package main.java.schildt.other;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 9, 6);
        double vol;
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
    }
}