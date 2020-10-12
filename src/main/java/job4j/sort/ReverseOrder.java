package job4j.sort;

import java.util.Comparator;

/**
 * Метод позволяет получить обратный компаратор для строки.
 */
public class ReverseOrder {
    public static Comparator<String> reverseOrder() {
        return Comparator.reverseOrder();
    }
}
