package lafore.stack;

/**
 * Перестановка символов в слове.
 */
public class CharReverser {
    private String input;
    private String output;

    public CharReverser(String in) {
        input = in;
    }

    /**
     * Метод делает перестановку символов в слове.
     * @return
     */
    public String doRev() {
        int stackSize = input.length();
        StackChar theStack = new StackChar(stackSize);
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
}
