package lafore.queue;

/**
 * Пример реализации очереди.
 */
public class Queue {
    private int maxSize; // размер массива
    private long[] queArray; // массив
    private int front; // первый элемент в очереди
    private int rear; // последний элемент в очереди
    private int nItems; // количество элементов

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = - 1;
        nItems = 0;
    }

    /**
     * Вставка элементов в конец очереди.
     * @param j
     */
    public void insert(long j) {
        if (rear == maxSize - 1) { // Циклический перенос
            rear = - 1;
        }
        queArray[++rear] = j;
        nItems++;
    }

    /**
     * Извлечение элемента в начале очереди.
     * @return
     */
    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    /**
     * Чтение элемента в начале очереди.
     * @return
     */
    public long peekFront() {
        return queArray[front];
    }

    /**
     * True, если очередь пуста.
     * @return
     */
    public boolean isEmpty() {
        return nItems == 0;
    }

    /**
     * True, если очередь заполнена.
     * @return
     */
    public boolean isFull() {
        return nItems == maxSize;
    }

    /**
     * Количество элементов в очереди.
     * @return
     */
    public int size() {
        return nItems;
    }
}
