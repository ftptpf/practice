package job4j.sort;

import java.util.Comparator;

public class NullLastMethod {
    /**
     * Метод перемещает все null строки в конец.
     * @return
     */
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
