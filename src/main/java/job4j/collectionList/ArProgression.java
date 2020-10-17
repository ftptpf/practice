package job4j.collectionList;

import java.util.List;

public class ArProgression {
    /**
     * Метод опредиляет является ли список чисел арифметической прогрессией.
     * Если является - то метод возращает сумму всех элементов, иначе - возращает 0.
     * @param data
     * @return
     */
    public static int checkData(List<Integer> data) {
        boolean count = true;
        int sum = 0;
        for (int i = 0; i < data.size() - 2; i++) {
            if ((data.get(i) + data.get(i + 2)) / 2 != data.get(i + 1)) {
                count = false;
                break;
            }
        }
        if (count) {
            for (int el : data) {
                sum = sum + el;
            }
        }
        return sum;
    }
}
