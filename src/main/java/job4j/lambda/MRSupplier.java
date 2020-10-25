package job4j.lambda;

import java.util.function.Supplier;

public class MRSupplier {
    /**
     * Метод создает пустую стору через new.
     * Интерфейс Supplier служит для того, чтобы обернуть логику создания объекта.
     * Он ничего не принимает, только возвращает объект, который ему поручили создать.
     * Ссылки на методы поддерживает метод new, который позволяет нам создать нужный нам объект.
     * @return
     */
    public static Supplier<String> supplier() {
        return String::new;
    }
}
