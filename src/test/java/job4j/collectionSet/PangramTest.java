package job4j.collectionSet;

import org.junit.Test;
import ru.practice.job4j.collectionSet.Pangram;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PangramTest {

    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
        assertThat(b, is(true));
    }
}