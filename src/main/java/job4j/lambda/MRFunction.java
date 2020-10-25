package job4j.lambda;

import java.util.function.Function;

public class MRFunction {
    /**
     * Создаем Function через ссылку на метод. В качестве функции использует Math.sqrt().
     * @return
     */
    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
