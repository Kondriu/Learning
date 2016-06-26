package dima.homework5;

/**
 * Created by dmitriy on 24.05.16.
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
 * выведите массив на экран в строку.
 * Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
 * Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */
public class HomeWork5Java4 {

    public static void main(String[] args) {


        int n = 11;
        int a = 0, b = 0, c = 0;

        int arraybool[] = new int[n];


        System.out.println("New random aray [-1;1]: ");
        for (int i=0; i<n; i++)
        {
            arraybool[i]= (int) Math.floor(Math.random()*3 -1);
            System.out.print( arraybool[i]+"\t");
        }
        System.out.println();

        for (int i =0; i<n; i++)
        {
            switch (arraybool[i])
            {
                case -1:
                    a++;
                    break;
                case 0:
                    b++;
                    break;
                case 1:
                    c++;
                    break;
            }
        }
        System.out.println();
       // System.out.println("a: "+a+"\tb: "+b+"\tc: "+c); //вывод результатов подсчета, в задаче не требуется

        if (a > b & a > c)
        {
            System.out.println("В массвие больше всего элементов \"-1\" ");
        } else {
                if (b > a & b >c)
                    {
                        System.out.println("В массвие больше всего элементов \"0\" ");
                    } else {
                                if (c > a & c > b)
                                    {
                                        System.out.println("В массвие больше всего элементов \"1\" ");
                                    }
                            }
                }



    }
}
