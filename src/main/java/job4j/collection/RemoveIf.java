package job4j.collection;

import java.util.List;

public class RemoveIf {
    /**
     * Метод возвращает список строк состоящих из 5 и более символов.
     * @param list
     * @return
     */
    public static List<String> sortList(List<String> list) {
        list.removeIf(x -> (x.length() < 5));
        return list;
    }
}
