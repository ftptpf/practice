package ru.practice.job4j.collectionSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    /**
     * Метод принимает массив строк, который содержит последовательность элементов игровой комбинации.
     * Метод возращает true - если комбинация является выигрышной.
     * @param combination
     * @return
     */
    public static boolean checkYourWin(String[] combination) {
        Set<String> comb = new HashSet<>(Arrays.asList(combination));
        return comb.size() == 1;
    }
}
