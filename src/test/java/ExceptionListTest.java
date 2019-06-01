import exception.ExceptionList;
import org.junit.Test;

import java.util.ArrayList;

public class ExceptionListTest {

    @Test(expected = ExceptionList.class)
    public void checkSize() throws ExceptionList {
        ArrayList<Integer> arrayList = new ArrayList<>();
        FindMaximumSequence findMaximumSequence = new FindMaximumSequence();
        findMaximumSequence.recursiveFindMaximumSequence(arrayList);
    }
}