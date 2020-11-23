package job4j.stream;

import java.util.List;

public class ReduceMethodOneArgument {
    /**
     * Метод находит произведение чисел.
     * @param list
     * @return
     */
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((n1, n2) -> n1 * n2).get();
    }
}
