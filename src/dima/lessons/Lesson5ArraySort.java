package dima.lessons;

/**
 * Created by root on 5/19/16.
 */
public class Lesson5ArraySort {

    public static void main(String[] args) {


        int mass [] = new int[10];
        int n = mass.length;
        int diff = 0;
        boolean t = true;

        for (int i=0; i<(n); i++) {
            mass[i] = (int) (Math.floor(Math.random() * 100));
            System.out.print(mass[i] + "\t ");
        }
        System.out.println(" ");

        while (t == true)
            {
            t=false;
            for (int j=0; j<(n-1); j++)
                {
                if (mass[j] > mass[j+1])
                    {
                    diff = mass[j];
                    mass[j]=mass[j+1];
                    mass[j+1] = diff;
                    t = true;
                        for (int i=0; i<(n); i++){System.out.print(mass[i] + "\t ");} //выводит результат текущей итерации. можно удалять
                        System.out.println(" "); //перевод строки для раздления итераций.
                    }
                }
            }//

        System.out.println("\nрезультат ");

        for (int i=0; i<(n); i++){
            System.out.print(mass[i] + "\t ");
        }
        System.out.println(" ");

    }

}
