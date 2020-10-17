package job4j.collectionList;

import java.util.Iterator;
import java.util.List;

public class IteratorForList {
    /**
     *  Метод проходит по всему списку, выводит информацию что следующий элемент есть(в виде значения true),
     *  а также значение этого элемента. Также после обхода списка выводит информацию, что больше элементов нет.
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next element has - " + iterator.hasNext() + ", this element is " + iterator.next());
        }
        System.out.println("Next element has - " + iterator.hasNext());
    }
}
