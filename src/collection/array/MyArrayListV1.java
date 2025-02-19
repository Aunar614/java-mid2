package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        // size = 3
        // [1, 2, 3, null, null] 일 경우 Arrays.copyOf를 활용해 [1, 2, 3]만 출력
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size = " + size + ", capacity = " + elementData.length;
    }
}
