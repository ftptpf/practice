package job4j.sort;

public class CompareMethod {
    /**
     * Метод сравнивает два числа в прямом порядке.
     * @param first
     * @param second
     * @return
     */
    public static int ascendingCompare(int first, int second) {
        return Integer.compare(first, second);
    }

    /**
     * Метод сравнивает два числа в обратном порядке.
     * @param first
     * @param second
     * @return
     */
    public static int descendingCompare(int first, int second) {
        return Integer.compare(second, first);
    }
}
