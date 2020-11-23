package job4j.collectionMap;

import java.util.*;

public class Dictionary {
    /**
     * Метод реализует словарь. Происходит перебор массива и добавление строки в карту таким образом,
     * чтобы ключом был первый символ строки, а значением - список строк, которые начинаются на первый символ строки.
     * @param strings Массив строк.
     * @return
     */
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        Set<String> keySet = new HashSet<>();
        List<String> secondList = new ArrayList<>();

        for (String s : strings) { // перебираем массив строк
            keySet.add(String.valueOf(s.charAt(0))); // из первые букв строк формируем SET уникальных ключей
        }

        for (String key : keySet) { // берем ключ из SET уникальных ключей
            secondList.clear(); // обнуляем LIST
            for (String s : strings) { // берем строку
                if (s.startsWith(key)) { // если строка начинается с ключа
                    secondList.add(s); // записываем строку в LIST
                }
            }
            rsl.put(key, secondList); // ключ и соответствующий ему LIST записываем в MAP
            // и уходим на цикл следующего ключа
        }
        return rsl;
    }
}
