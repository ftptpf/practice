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
        FileInputStream fin = null;
        // Убедимся что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла. ");
        }
        // Сначала открывается файл,
        // а затем из него читаются символы до тех пор,
        // пока не встретится признак конца файла
        try {
            fin = new FileInputStream(args[0]);
            do {
               i = fin.read();
               if (i != -1) {
                    System.out.print((char) i);
               }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода.");
        } finally {
            // закрыть файл в любом случае
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }
    }
}
