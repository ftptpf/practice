package ru.practice.job4j.collectionSet;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    /**
     * Метод принимает на входе строку, которая является словом, все буквы написаны в нижнем регистре.
     * Входная строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
     * Метод возращает булево значение - если слово является изограммой - то метод возращает true, иначе - false.
     * @param s
     * @return
     */
    public static boolean checkString(String s) {
        char[] a = s.toCharArray();
        Set<Character> sList = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            sList.add(a[i]);
        }
        System.out.println(sList.size() + " " + s.length() + " " + a.length);
        return sList.size() == s.length();
    }
}
// Изограмма - это слово, которое не содержит повторяющихся букв, т.е. все буквы в таком слове уникальные.