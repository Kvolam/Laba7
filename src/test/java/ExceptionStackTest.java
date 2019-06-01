import exception.ExceptionStack;
import org.junit.Test;

import java.util.Stack;

public class ExceptionStackTest {

    @Test(expected = ExceptionStack.class)
    public void checkSize() throws ExceptionStack {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        FindElemStack st = new FindElemStack();
        st.recursiveFindSecondElem(stack);

    }
}
