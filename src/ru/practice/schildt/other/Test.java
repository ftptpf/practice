package ru.practice.schildt.other;

public class Test {
    int a, b;
    Test(int i, int j) {
        a = j;
        b = i;
    }
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
