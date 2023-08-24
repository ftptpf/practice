package ru.practice.job4j.collectionMap;

import java.util.*;

public class MostUsedCharacter {
    /**
     * Метод принимает строку, возращает символ в строке, который употребляется наибольшее количество раз.
     * Если окажется что таких символов несколько - возвращается первый из символов.
     * Чтобы обеспечить сортировку символов - собираем исходную строку в TreeMap(),
     * в которой ключ - это символ, значение - количество.
     * Перед тем как собирать строку приводим её к нижнему регистру, удаляем пробелы.
     * @param str строка, которая может содержать несколько пробелов, однако в ней отсутствуют знаки препинания.
     * @return  символ в строке, который употребляется наибольшее количество раз.
     */
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String s = str.toLowerCase().replaceAll("\\s",""); // все буквы строки опускаем в нижний регистр и убираем пробелы
        Map<Character, Integer> map = new TreeMap<>(); // создаем карту
        for (int i = 0; i < s.length(); i++) {
            int z = i;
            map.computeIfAbsent(s.charAt(i), (count) -> 1); // если буква никогда не встречалась добавляем её в карту как ключь и присваиваем значение 1
            map.computeIfPresent(s.charAt(i), (key, value) -> value + 1); // если буква уж установлена как ключь, увеличиавем её значение на 1
        }

        List<Character> listChar = new ArrayList<>(map.keySet()); // в список перебарсываем все ключи
        List<Integer> listInt = new ArrayList<>(map.values()); // в список перебрасываем все значения
        int max = Collections.max(listInt); // находим максимальное значение
        int ind = listInt.indexOf(max); // находим индекс максимального значения
        rsl = listChar.get(ind); // находим по тому же индексу ключь максимального значения

        return rsl;
    }
}
