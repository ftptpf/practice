package job4j.sort;

import java.util.Comparator;

public class NullLastMethod {
    public static Comparator<String> nullLast() {
        //nullLast().
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
