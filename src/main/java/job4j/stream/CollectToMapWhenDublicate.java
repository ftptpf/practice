package job4j.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapWhenDublicate {
    /**
     * Метод собирает переданный стрим в Map, где ключ сам элемент, а значение это его квадрат.
     * В случае дубликата в стриме указываем, что останется предыдущее значение.
     * @param data
     * @return
     */
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, cur) -> prev));

    }
}
