package ru.practice.lafore.stack;

/**
 * Реализация стека на массиве символов.
 */
public class StackChar {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackChar(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = - 1;
    }
    /**
     * Размещаем элемент на вершине стека.
     * @param j
     */
    public void push(char j) {
        stackArray[++top] = j;
    }

    /**
     * Извлекаем элемент с вершины стека.
     * @return
     */
    public char pop() {
        return stackArray[top--];
    }

    /**
     * Чтение элемента с вершины стека.
     * @return
     */
    public char peek() {
        return stackArray[top];
    }

    /**
     * True, если стек пустой.
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }
}
