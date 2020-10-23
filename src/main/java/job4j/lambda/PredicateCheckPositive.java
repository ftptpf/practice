package job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckPositive {
    /**
     * Метод через лямбда выражение проверяет что число положительное.
     * @param num
     * @return
     */
    public static boolean check(int num) {
        return check(x -> x > 0, num);

    }
    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
