package ru.practice.schildt.io21;

import java.io.File;

/**
 * Демонстрация метода list() для просмотра содержимого каталога.
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "resources";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String[] s = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " является каталогом");
                } else {
                    System.out.println(s[i] + " является файлом");
                }
            }
        }
    }
}
