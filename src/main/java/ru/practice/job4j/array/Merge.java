package ru.practice.job4j.array;

public class Merge {
    /**
     * Метод два отсортированных по возрастанию массива без сортировки объединяет в третий.
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rf = 0, lf = 0;

        if (rsl.length == 0) {
            rsl = left;
        } else if (left.length == 0) {
            rsl = right;
        } else if (right.length == 0) {
            rsl = left;
        } else {
            for (int i = 0; i < rsl.length; i++) {
                if (lf < left.length && left[lf] <= right[rf]) {
                    rsl[i] = left[lf];
                    lf = lf + 1;
                } else if (rf < right.length) {
                    rsl[i] = right[rf];
                    rf = rf + 1;
                }
            }
        }
        return rsl;
    }
}
