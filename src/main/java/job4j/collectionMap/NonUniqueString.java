package job4j.collectionMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class NonUniqueString {
    /**
     * Метод принимает массив строк, в котором строки могут повторяться.
     * Необходимо перебрать массив строк и сложить их в карту.
     * При этом должны выполниться следующие условия:
     * 1. Ключом является строка.
     * 2. Значением будет булево переменная.
     * 3. Если строка встречается в массиве 2 и более раз, то булево значение должно быть true.
     * В ином случае - должно принимать значение false.
     * @param strings
     * @return
     */
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> rsl = new TreeMap<>();
        Set<String> st = new TreeSet<>();
        int count;

        for (String s : strings) {
            st.add(s);
        }
        for (String key : st) {
            count = 0;
            for (int i = 0; i < strings.length; i++) {
                if (key.equals(strings[i])) {
                    count = count + 1;
                }
            }
            if (count > 1) {
                rsl.put(key, true);
            } else {
                rsl.put(key, false);
            }
        }
        return rsl;
    }
}
