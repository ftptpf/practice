package ru.practice.job4j.stream;

import java.util.stream.Stream;

public class StreamOfMethod {
    /**
     * Метод создает стрим из символов 'a', 'b', 'c'.
     * @return
     */
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
