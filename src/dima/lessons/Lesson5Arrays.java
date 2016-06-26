package dima.lessons;

/**
 * Created by root on 5/19/16.
 */
public class Lesson5Arrays {

    public static final int SIZE = 10;



    public static void main(String[] args) {


        //варинты инициализации массивов:
        int [] intArrayOneIntStyle = new int[5];
        int intAtrrayNextIntStyle [] = new int[5];

        char[] charArray = new char[SIZE];

        double[] doubleArray = {1.2, 2.2, 3.5};
        boolean[] boolanArray = new boolean[]{true,true,false};


        //можно  переназначать эл-ты массива


        char[] char2 = {'A', 'c', 'Ы', 'ё'}; //не выводиться! почему?
        for (int i=0; i == 3; i++) {
            System.out.print(char2[i] + " ");
                    }

        int[] arInt = {2, 3, 6};
        for (int j = 0; j < 3; j++)
        {  System.out.print(arInt[j] + " ");}







    }


}
