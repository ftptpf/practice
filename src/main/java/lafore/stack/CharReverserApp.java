package lafore.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Демонстрация реализации перестановки букв в слове.
 */
public class CharReverserApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            CharReverser theReverser = new CharReverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
