package job4j.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    /**
     * Метод совместно использует два Consumer.
     * @param input
     * @return
     */
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = (in) -> System.out.print(input);
        Consumer<String> ln = (x) -> System.out.println();
        return print.andThen(ln);
    }
}
