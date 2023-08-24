package ru.practice.htpatterns.decorator.inout;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Класс преобразует все символы верхнего регистра входного потока к нижнему регистру.
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * Метод преобразует байт в символ нижнего регистра.
     * @return
     * @throws IOException
     */
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    /**
     * Метод преобразует массив байтов в символы нижнего регистра.
     * @param b
     * @param offset
     * @param len
     * @return
     * @throws IOException
     */
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
