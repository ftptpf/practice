package ru.practice.job4j.lambda;

import java.util.function.Function;

public class FunctionSqrt {
    /**
     * Метод с помощью лямбда выражения извлекает корень квадратный из числа.
     * @param x
     * @return
     */
    public static double calculate(double x) {
        return calculate(Math::sqrt, x); // вариант №1
        // return calculate(z-> Math.sqrt(z), x); // вариант №2
    }

    private static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
