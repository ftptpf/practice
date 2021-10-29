package other.recursion;

public class Sequence {
    private int number;

    private int sequence(int i) {
        System.out.println("in --- " + i);
        if (i >= 0) {
            return sequence(i - 1);
        }
        System.out.println("out --- " + i);
        return i;
    }

    private int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    private int branching(int z) {
        System.out.println("out --------------- " + z);
        if (z <= 0) {
            return z;
        }
        return branching(z - 1) + branching(z - 2);
    }


    public static void main(String[] args) {
        Sequence s = new Sequence();
        s.sequence(10);
        System.out.println(s.factorial(6));
        s.branching(10);
    }
}
