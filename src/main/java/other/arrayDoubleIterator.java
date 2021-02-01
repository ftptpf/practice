package other;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class arrayDoubleIterator implements Iterator {
    private final int[][] data;
    private int i, j;

    public arrayDoubleIterator(int[][] data) {
        this.data = data;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int element = data[i][j];
        j++;
/*        while (data[i].length == 0) {
            i++;
        }*/
        while (i < data.length && j >= data[i].length) {
            j = 0;
            i++;
        }
        return element;
    }

    @Override
    public boolean hasNext() {
        // проверяем количество строк
        // проверяем количество элементов в конкретной строке
        if (data[i].length == 0) {
            i++;
        }
        return (i < data.length && j < data[i].length);
    }
}
// смотришь если column равен длине внутреннего массива  —> ну и дальше смотришь длины след строк равны ли 0
// (пропускаешь их если такие есть, так до конца и дойдешь сколько там пустых навставляли)