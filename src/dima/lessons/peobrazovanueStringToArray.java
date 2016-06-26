package dima.lessons;

import java.util.Scanner;

/**
 * Created by dmitriy on 26.05.16.
 */
public class peobrazovanueStringToArray {
    public static void main(String[] args) {


        System.out.println("введите слово eng: ");
        Scanner sc = new Scanner(System.in);
        String inpt = sc.nextLine();
        System.out.println();
        System.out.println("вы ввели: "+inpt);

        int l=inpt.length();
        System.out.println(l);
        char inptStr [] = new char[l];

        for (int i =0; i<l; i++) //цикл для преобразвании введенной строки в массив
        {
            inptStr[i]=inpt.charAt(i); //inpt.charAt - сохраняет в чар сивол с заданным номером позицци в строке
        }//таким образом дерибаним стринг на отдельные чары и складываем в массив

        System.out.println("\n массив: ");
        for (int i =0; i<l; i++)
        {
            System.out.print("\t"+inptStr[i]);
        }

    }
}
