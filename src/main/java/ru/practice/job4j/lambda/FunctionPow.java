package ru.practice.job4j.lambda;

import java.util.function.Function;

public class FunctionPow {
    /**
     * Метод с помощью лямбда выражения возводит переданное число в квадрат.
     * @param x
     * @return
     */
    public static double calculate(double x) {
        return calculate(z -> Math.pow(z, 2.0), x);
    }

    private static double calculate(Function<Double, Double> y, Double x) {
        return y.apply(x);
    }
}
