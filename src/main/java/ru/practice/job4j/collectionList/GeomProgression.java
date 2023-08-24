package ru.practice.job4j.collectionList;

public class GeomProgression {
    /**
     * Метод генерирует геометрическую прогрессию,
     * при этом возвращает сумму элементов сгенерированной последовательности.
     * @param first Первый элемент геометрической прогрессии.
     * @param denominator Знаменатель прогрессии.
     * @param count Количество элементов, которое должно содержаться в сгенерированной последовательности.
     * @return
     */
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = (int) (first * (Math.pow(denominator, count) - 1)) / (denominator - 1);
        return sum;
    }
}
