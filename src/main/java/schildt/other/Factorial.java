package main.java.schildt.other;

public class Factorial {
    int fact (int n) {
        int result;
        if(n == 1) {
            System.out.println(1);
            System.out.println("n : " + n);
            return 1;
        }
        result = fact(n - 1) * n;
        System.out.println(result);
        System.out.println("n : " + n);
        return result;
    }
}
