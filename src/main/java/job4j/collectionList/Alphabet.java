package job4j.collectionList;

import java.util.*;

public class Alphabet {
    /**
     * Метод принимает строку, котороя является одним словом, без знаков препинания цифр и пробелов.
     * Метод возращает новую строку, в которой все символы исходной строки будут расставлены в алфавитном порядке.
     * @param s
     * @return
     */
    public static String reformat(String s) {
        List<String> list = new LinkedList<>();
        for (String el : s.split("")) {
            list.add(el);
        }
        list.sort(Comparator.naturalOrder());
        StringBuffer srt = new StringBuffer();
        for (String z : list) {
            srt.append(z);
        }
        String st = srt.toString();

        return st;
    }
}
