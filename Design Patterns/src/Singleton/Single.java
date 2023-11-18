package Singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Single {

    private Integer[] numbers = {1, 2, 3, 4, 5};
    private List<Integer> list = Arrays.asList(numbers);

    public Single() {
        System.out.println("Object created");
        Collections.shuffle(list);
        System.out.println(this.hashCode());
    }
    public void printer() {
        for (Integer i : list) {
            System.out.print(i.toString() + " ");
        }
        System.out.println();
    }
}