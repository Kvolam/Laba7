

import exception.ExceptionStack;

import java.util.Stack;

class FindElemStack {


    int findSecondElemSream(Stack<Integer> stack) throws ExceptionStack {
        if (stack.size() < 2) {
            throw new ExceptionStack("Недостаточно элементов в стеке");
        } else {

            return stack.stream().skip(1).findFirst().get();
        }
    }

    int recursiveFindSecondElem(Stack<Integer> stack) throws ExceptionStack {
        int index = 0;
        Stack<Integer> stackTemp = new Stack<>();
        return this.findSecondElem(stack, index, stackTemp);
    }

    private int findSecondElem(Stack<Integer> stack, int index, Stack<Integer> stackTemp) throws ExceptionStack {
        if (!(stack.isEmpty() || stack.size() < 2)) {
            if (stack.size() == 2) {
                return stack.peek();
            }
            if (index < (stack.size() - 1)) {
                index++;
                stackTemp.add(stack.pop());
                return this.findSecondElem(stack, index, stackTemp);
            }
            stack.addAll(stackTemp);
            return stackTemp.pop();
        } else throw new ExceptionStack("Недостаточно элементов в стеке");
    }


}
