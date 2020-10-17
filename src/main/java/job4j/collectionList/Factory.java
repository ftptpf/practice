package job4j.collectionList;

import java.util.List;

public class Factory {
    /**
     * В методе заполняем коллекцию значениями от first до fifth с помощь фабричного метода of().
     * После этого с помощью цикла for() с индексами и метода get() выводим все элементы.
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
