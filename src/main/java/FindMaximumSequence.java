import exception.ExceptionList;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class FindMaximumSequence {


    int findMaximumSequenceStream(ArrayList<Integer> list) throws ExceptionList {
        AtomicInteger index = new AtomicInteger();
        AtomicInteger lengthTemp = new AtomicInteger();
        AtomicInteger length = new AtomicInteger();
        if (list.isEmpty()) {
            throw new ExceptionList("Пустой лист");
        } else {
            list.stream().forEach(i -> {
                if (list.get(i) < list.get(i + 1)) {
                    lengthTemp.getAndIncrement();
                } else if (lengthTemp.get() > length.get()) {
                    index.set(i + 1);
                    lengthTemp.set(0);
                } else lengthTemp.set(0);
            });
            return index.get();
        }
    }

    int recursiveFindMaximumSequence(ArrayList<Integer> list) throws ExceptionList {
        if (!list.isEmpty()) {
            int index = 0;
            int length = 0;
            int indexTemp = 0;
            int lengthTemp = 0;
            return findMaximumSequence(list, index, length, lengthTemp, indexTemp);
        } else throw new ExceptionList("Пустой лист");
    }


    private int findMaximumSequence(ArrayList<Integer> list, int index, int length, int lengthTemp, int indexTemp) {
        if (list.size() == 1)
            return 0;
        if (index == 0) {
            index++;
            lengthTemp++;
            return findMaximumSequence(list, index, length, lengthTemp, indexTemp);
        }
        if ((list.get(index) > list.get(index - 1)) && index != list.size() - 1) {
            lengthTemp++;
            index++;
            return findMaximumSequence(list, index, length, lengthTemp, indexTemp);
        }
        if ((list.get(index) < list.get(index - 1)) && index != list.size() - 1) {
            if (lengthTemp > length) {
                length = lengthTemp;
                indexTemp = index - lengthTemp;
            }
            lengthTemp = 0;
            index++;
            return findMaximumSequence(list, index, length, lengthTemp, indexTemp);
        }
        return indexTemp;
    }
}
