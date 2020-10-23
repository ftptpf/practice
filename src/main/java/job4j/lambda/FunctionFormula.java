package job4j.lambda;

import java.util.function.Function;

public class FunctionFormula {
    /**
     * Метод с помощью лямбда выражения передает число в формулу: num * num + 2 * num + 1
     * @param x
     * @return
     */
    public static double calculate(double x) {
        return calculate(z -> z * z + 2 * z +1, x);
    }

    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
