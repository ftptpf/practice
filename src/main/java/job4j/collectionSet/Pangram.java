package job4j.collectionSet;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    /**
     * Метод определяет является ли входящая строка панграммой.
     * Строчные и прописные буквы являются одинаковыми символами, пробелы игнорируются.
     * @param s
     * @return
     */
    public static boolean checkString(String s) {
        char[] z = s.toCharArray();
        Set<Character> hs = new HashSet<>();

        for (int i = 0; i < z.length; i++) {
            if (z[i] != ' ') {
                hs.add(z[i]);
            }
        }
        System.out.println(hs.size());
        return hs.size() == 26;
    }
}
