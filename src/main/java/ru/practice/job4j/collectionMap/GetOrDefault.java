package ru.practice.job4j.collectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetOrDefault {

    private Map<Integer, List<String>> store = new HashMap<>();

    /**
     * Метод добавляет элемент list(значение) с ключом index в хранилище store только в том случае,
     * если такого ключа пока еще нет в хранилище.
     * @param index
     * @param list
     */
    public void addValue(int index, List<String> list) {
        if (!store.containsKey(index)) {
            store.put(index, list);
        }
    }

    /**
     * Метод возращает значение которое соответствует ключу index,
     * если такого ключа нет - необходимо вернуть пустой список.
     * @param index
     * @return
     */
    public List<String> getValue(int index) {
        return store.getOrDefault(index, new ArrayList<String>());
    }
}
