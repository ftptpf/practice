package ru.practice.job4j.collectionList;

import java.util.List;

public class SplitterList {
    /**
     * Метод  возращает список, основой которого будет первый, присутствовать элементы из второго
     * и точно отсутствовать элементы из третьего.
     * @param left Общий список элементов
     * @param middle Список важных элементов, но не обязательных
     * @param right Список элементов, которые обязательно должны отсутствовать в результирующем списке
     * @return
     */
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        return left;
    }
}
