package job4j.lambda;

import java.util.function.Consumer;

public class MethodReference {
    /**
     * Method reference к нестатическому методу обращение может быть
     * через объект класса, например, this::print, или переменная::print, так и через класс, например String::compareTo.
     */
    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    /**
     * Method reference к статическому методу обращение идет через имя класса.
     */
    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }

}
