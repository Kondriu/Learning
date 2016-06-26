package dima.homework5;

/**
 * Created by dmitriy on 24.05.16.
 * Отсортировать массив чисел по убыванию. (например массив 5, 12, 2, 7)
 * после сортировки должен выглядеть так: 12, 7, 5, 2.
 * (НЕ ИСПОЛЬЗОВАТЬ КЛАСС Arrays!!!)
 */

public class HomeWork5Java5 {

    public static void main(String[] args) {

        int n = 20;
        int revArray [] = new int[n];


        System.out.println("новый случайный массив: ");
        for (int i =0; i < revArray.length; i++)
        {
            revArray[i] = (int) Math.floor(Math.random() * 20);
            System.out.print("\t"+revArray[i]);
        }
        System.out.println();

        int dif;
        boolean t= true;
        while (t==true)
        {
            t = false;
            for (int i = 0; i < (revArray.length-1); i++)
            {
                if (revArray[i]<revArray[i+1])
                {
                    dif = revArray[i];
                    revArray[i]=revArray[i+1];
                    revArray[i+1] = dif;
                    t=true;
                }
            }
        }

        System.out.println("\n массив, отсортированный по убыванию: ");
        for (int i=0; i < revArray.length; i++)
            {
                System.out.print("\t"+revArray[i]);
            }
    }
}
