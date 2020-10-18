package job4j.collectionMap;

import java.util.HashMap;
import java.util.Map;

public class KeySet {
    /**
     * Метод выводит в консоль все значения отображения.
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (int key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
