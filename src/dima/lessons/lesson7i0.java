package dima.lessons;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by root on 5/26/16.
 */
public class lesson7i0 {
    public static void main(String[] args) {


/// String.split()

        System.out.println("Enter numbers using comma delimiter: ");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] splittedStringArray = inputStr.split(",");
        int [] intArry = new int[splittedStringArray.length];

        for (int i =0; i<splittedStringArray.length; i++)
        {
            intArry[i] = Integer.valueOf(splittedStringArray[i]);
        }

        System.out.println(Arrays.toString(splittedStringArray)
                .replace("[", "")
                .replace("]", ""));


    }
}
