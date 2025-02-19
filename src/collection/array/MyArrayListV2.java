package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }

        elementData[size] = e;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // Arrays.copyOf를 사용하여 기존 배열을 새로운 배열에 복사
        elementData = Arrays.copyOf(elementData, newCapacity);
/*
        Object[] newArr = new Object[newCapacity];

        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
*/
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
