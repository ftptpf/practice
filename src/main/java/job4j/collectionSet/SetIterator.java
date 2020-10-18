package job4j.collectionSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetIterator {
    /**
     * Метод в цикле печатает строки пока они есть,
     * при этом на каждой итерации выводилось сообщение, что значение существует в наборе.
     * @param args
     */
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", iter.hasNext()));
            System.out.println(iter.next());
        }
    }
}
