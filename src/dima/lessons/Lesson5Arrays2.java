package dima.lessons;

import java.util.Arrays;

/**
 * Created by root on 5/19/16.
 */
public class Lesson5Arrays2 {
//правильная сортировка массива

    public static void main(String[] args) {

        int mass [] = {2, 4, 6, 8, 5, 3, 19, 9};
        Arrays.sort(mass);

        System.out.println("sorted : "+ Arrays.toString(mass));

    }
}
