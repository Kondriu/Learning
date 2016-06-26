package dima.lessons;


import static java.lang.Math.PI; // либа добавилась автоматически,
// когда я написал в коде "PI" - она была подсвечена карсным, я вызвал на ней контекстное меню и

/**
 * Created by dmitriy on 14.05.16.
 */
public class ForTest {
    public static void main(String[] args) {
        int x;

        for (x=0; x<10; x++)  // запись "х++" эквивалентна записи "х=х+1" - означает увеличение на 1 значение переменной х
            System.out.println("значене Х: " +(x*PI));
            //System.out.println("A = "+a+"B ="+b);


    }
/*
    public static void ciclum (String[] args){
        int a, b;
        if (a < b){
            a = b;
            b = 0;
            }
    }
*/
}


