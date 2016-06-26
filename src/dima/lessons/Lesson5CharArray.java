package dima.lessons;

import java.util.Arrays;

/**
 * Created by root on 5/19/16.
 */
public class Lesson5CharArray {

    public static void main(String[] args) {

        char chars [] = new char[256];

        for (int i=0; i <= 255; i++){
            chars[i] = (char) Math.floor(Math.random() * 1000);
            //chars[i] = (char) i;

            System.out.println(i+"\t - "+chars[i]);
        //    System.out.print(+chars[i]+", " );

/*            System.out.println("Array: " + Arrays.toString(chars));

            System.out.println("Array: \n" +Arrays.toString(chars));*/
        }
       // System.out.println("Array 1: " + Arrays.toString(chars));
        System.out.println("Array 2: \n" +Arrays.toString(chars));

    }
}
