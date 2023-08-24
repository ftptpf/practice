package ru.practice.job4j.array;

public class ConcatArray {
    /**
     * Метод определяет общий размер двух массивов..
     * @param a
     * @param b
     * @return
     */
    public static int combineSize(int[] a, int[] b) {
        int[] rsl = new int[a.length + b.length];
        return rsl.length;
    }
}
