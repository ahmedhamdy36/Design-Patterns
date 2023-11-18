package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Single_ {
    private Integer[] numbers = {1, 2, 3, 4, 5};
    private List<Integer> list = Arrays.asList(numbers);
    private static Single_ instance;

    public static Single_ getInstance() {
        if (instance == null) {
            instance = new Single_();
        }
        return instance;
    }
    private Single_() {
        System.out.println("Object created");
        Collections.shuffle(list);
    }
    public void printer() {
        for (Integer i : list) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();
    }
}