package ru.practice.job4j.collectionSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Firewall {
    /**
     * Метод принимает строку, которая является названием статьи, а также коллекцию Set в которой содержатся слова,
     * которые не должны содержаться в названиях статей, чтобы мы могли сконцентрироваться на материале изучения.
     * Метод возращает:
     * 1. Если в строке нет ни одного слова из коллекции Set,
     * то метод вернет строку: Вы сделали правильный выбор!
     * 2. Если в строке имеется хоть одно из слов из коллекции Set,
     * метод вернет строку: Выберите другую статью...
     * @param s
     * @param words
     * @return
     */
    public static String checkName(String s, Set<String> words) {
        String result = "Вы сделали правильный выбор!";
        String[] st = s.split(" ");
        List<String> aList = Arrays.asList(st);
        for (String word : words) {
            if (aList.contains(word)) {
                result = "Выберите другую статью...";
                break;
            }
        }
        return result;
    }
}
