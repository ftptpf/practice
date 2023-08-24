package ru.practice.job4j.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorAriphmetic {
    /**
     * Метод умножает все элементы списка.
     * @param list
     * @return
     */
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new; // Создаем коллекцию где будем хранить результаты.
        BiConsumer<List<Integer>, Integer> consumer = List::add; // Указываем как мы будем собирать элементы в коллекцию.
        BinaryOperator<List<Integer>> merge = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };
        Function<List<Integer>, Integer> function = (ns) -> { // Функция котрая перемножает все элементы коллекции.
            int number = 1;
            for (Integer n : ns) {
                number = number * n;
            }
            return number;
        };
        return list.stream()
                .collect(Collector.of(supplier, consumer, merge, function));
    }
}
