package job4j.array;

public class EvenPrint {
    /**
     * Метод выводит все четные числа массива в порядке убывания их индексов.
     * @param array
     */
    public static void print(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
