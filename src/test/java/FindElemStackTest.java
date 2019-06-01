import exception.ExceptionStack;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class FindElemStackTest {

    @org.junit.Test
    public void findSecondElem() throws ExceptionStack {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        FindElemStack st = new FindElemStack();
        int expected = st.recursiveFindSecondElem(stack);
        int actual = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void findSecondElemSream() throws ExceptionStack {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        FindElemStack st = new FindElemStack();
        int expected = st.findSecondElemSream(stack);
        int actual = 2;
        assertEquals(expected, actual);
    }
}