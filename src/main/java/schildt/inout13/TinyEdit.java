package schildt.inout13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создаем поток ввода типа BufferedReader используя стандартный поток ввода System.in
 */
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[1000];
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) {
                break;
            }
        }
        System.out.println("Содержимое вашего файла:");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) {
                break;
            }
            System.out.println(str[i]);
        }
    }
}
