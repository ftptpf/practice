package job4j.collection;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String a = list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, a);
        }
        return list;
    }
}
