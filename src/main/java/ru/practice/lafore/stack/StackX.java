package ru.practice.lafore.stack;

/**
 * Реализация стека на массиве чисел.
 */
public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    /**
     * Размещаем элемент на вершине стека.
     * @param j
     */
    public void push(long j) {
        stackArray[++top] = j;
    }

    /**
     * Извлекаем элемент с вершины стека.
     * @return
     */
    public long pop() {
        return stackArray[top--];
    }

    /**
     * Чтение элемента с вершины стека.
     * @return
     */
    public long peek() {
        return stackArray[top];
    }

    /**
     * True, если стек пустой.
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * True, если стек полон.
     * @return
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
