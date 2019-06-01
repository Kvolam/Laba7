import exception.ExceptionList;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FindMaximumSequenceTest {

    @Test
    public void recursiveFindMaximumSequence() throws ExceptionList {
        ArrayList<Integer> list = new ArrayList<>(7);
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        for (int i = 0; i < 2; i++) {
            list.add(i);
        }
        FindMaximumSequence ls = new FindMaximumSequence();
        int actual = ls.recursiveFindMaximumSequence(list);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void findMaximumSequenceStream() throws ExceptionList {
        ArrayList<Integer> list = new ArrayList<>(7);
        for (int i = 0; i < 2; i++) {
            list.add(i);
        }
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        FindMaximumSequence ls = new FindMaximumSequence();
        int actual = ls.findMaximumSequenceStream(list);
        int expected = 2;
        assertEquals(actual, expected);
    }
}