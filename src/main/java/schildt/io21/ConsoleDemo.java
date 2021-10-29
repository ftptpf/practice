package schildt.io21;

import java.io.Console;

/**
 * Демонтсрация применения класса Console.0
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;
        con = System.console();
        if (con == null) {
            return;
        }
        str = con.readLine("Введите стоку: ");
        con.printf("Введенная вами строкаЖ %s\n", str);
    }
}
