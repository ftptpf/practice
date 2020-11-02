package job4j.collectionMap;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {
    /**
     * Метод принимает два отображения, которые имеют одинаковый размер, проходится по первому отображению
     * и к значению имени добавить значение фамилии,
     * чтобы на выходе получилось отображение - ключ(число) - значение(строка - имя + фамилия).
     * @param name Ключ - тип Integer, значение - тип String.
     *             При этом значение - это Имя, ключ - возрастающая последовательность, начиная с 1.
     * @param surname Ключ - тип Integer, значение - тип String.
     *                При этом значение - это Фамилия, ключ - возрастающая последовательность, начиная с 1.
     * @return
     */
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        Map<Integer, String> nameSurname = new HashMap<>();
        for (int i = 1; i <= name.size(); i++) {
            nameSurname.put(i, name.get(i)); // добавляем пару ключь - значение (имя) в отображение.
            int z = i;
            nameSurname.computeIfPresent(i, (key, value) -> name.get(z) + " " + surname.get(z)); // к существующей паре
            // ключь - значение (имя) в отображение добаляем через лямбда выражение по тому же ключу еще и фамилию.
        }
        return nameSurname;
    }
}
