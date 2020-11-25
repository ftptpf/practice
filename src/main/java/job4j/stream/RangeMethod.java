package job4j.stream;

import java.util.stream.IntStream;

public class RangeMethod {
    /**
     * Метод создает стрим в диапазоне чисел.
     * @param start
     * @param end
     * @return
     */
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
