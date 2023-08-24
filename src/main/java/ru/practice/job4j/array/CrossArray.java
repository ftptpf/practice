package ru.practice.job4j.array;

public class CrossArray {
    /**
     * Выводим в консоль числа, которые есть одновременно в первом и втором массиве.
     * @param left
     * @param right
     */
    public static void printCrossEl(int[] left, int[] right) {
        for (int j : left) {
            for (int i : right) {
                if ( j == i) {
                    System.out.println(i);
                }
            }
        }
    }
}
