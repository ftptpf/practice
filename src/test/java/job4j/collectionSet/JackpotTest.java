package job4j.collectionSet;

import org.junit.Test;
import ru.practice.job4j.collectionSet.Jackpot;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JackpotTest {

    @Test
    public void checkYourWinTrue() {
        String[] strings = {"@", "@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(true));
    }

    @Test
    public void checkYourWinFalse() {
        String[] strings = {"&&", "&", "&&&", "&&&&"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(false));
    }
}