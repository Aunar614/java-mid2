package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        // Set 구현체의 생성자에 배열은 전달할 수 없지만 List는 전닳할 수 있다.
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
