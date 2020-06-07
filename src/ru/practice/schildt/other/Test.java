package ru.practice.schildt.other;

public class Test {
    int a, b;
    Test(int i, int j) {
        a = j;
        b = i;
    }
    Test(int i) {
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
    void meth(Test o) {
        o.b *= 2;
        o.a /= 2;
    }
}
