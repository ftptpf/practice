package schildt.io21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        File file = new File("C:\\projects\\practice\\src\\main\\java\\schildt\\io21\\FileInputStreamDemo.java");

        try (FileInputStream f = new FileInputStream(file)) {
            System.out.println("Общее количество доступных байтов: " + (size = f.available()));
            int n = size/40;
            System.out.println("Первые " + n + "байтов прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
