package dima.homework6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dmitriy on 20.06.16.
 * Ввести строку из чисел через запятую
 * (пример: 25, 6, 8, 39, 8, 10, 2).
 * Найти сумму всех чисел из введенной строки.
 * Результат вывести в консоль
 */
public class HomeWork6Java3 {

    public static String b = new String();
    public static StringBuffer str = new StringBuffer();
    //public static ArrayList digits = new ArrayList();

    public static void main(String[] args) {

        /*
        substring(int start, int end)
        Returns a new String that contains a subsequence of characters currently contained in this sequence.

        indexOf(String str, int fromIndex)
        Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

         */
        System.out.println("Input String from keyboard");
        Scanner sc = new Scanner(System.in);
        b = sc.nextLine();
        str = str.append(b);

        System.out.println(b);
        String bNew = deleteSpaces(b); //очистили от пробелов
        String splitArray[] = bNew.split(","); //создали массив из стрк, разбитых по разделителю (",")
        int numArr[] = new int[splitArray.length]; // массив для интов
        for (int i =0; i<splitArray.length;i++){
            numArr[i] = Integer.parseInt(splitArray[i]);
        }

        //считается сумма
        int num = 0;
        for (int i =0; i<numArr.length;i++){
            num = num + numArr[i];
        }
        System.out.println("сумма: " + num);

    }


    public static String deleteSpaces(String string) {
    StringBuilder strBld = new StringBuilder();
    strBld.append(string);
    do {
        int a = strBld.indexOf(" ");
        strBld.deleteCharAt(a);
        } while (strBld.indexOf(" ") != -1);
    return strBld.toString();
}



}
