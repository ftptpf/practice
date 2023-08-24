package ru.practice.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {
    /**
     * Метод собирает все элементы итераторов в LIST.
     * @param it Вложенные итераторы.
     * @return
     */
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> prom;
        while (it.hasNext()) {
            prom = it.next();
            while (prom.hasNext()) {
                result.add(prom.next());
            }
        }
        return result;
    }
}
