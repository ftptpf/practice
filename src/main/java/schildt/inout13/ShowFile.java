package schildt.inout13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * В классе метод read() применяется для ввода из файла, содержащего текст в коде ASCII,
 * который затем выводится на экран.
 * Имя файла указывается в качестве аргумента командной строки.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // Убедимся что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла. ");
        }
        // Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл.");
        }
        // Далее читаем символы до тех пор,
        // пока не встретим признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла.");
        }
        // закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла.");
        }
    }
}
