package dima.homework5;

/**
 * Created by dmitriy on 22.05.16.
 *
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 * Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */

public class HomeWork5Java3 {

    public static void main(String[] args) {
        /* для решени  задачи решил использовать не одномерній массив, а таблицу из двух строк
        первая содержит индексы элементов
        вторая сам сгенерированный массив
        сортировать вторую строку - т.к. там находяться интересующие нас занчения,
        синхронно переставля индексы - для сохранения их нумерации
        по сохраненному индексу и узнаем, где он был изначально до сортировки
        */

        int n = 12; //длина массива, в нашем случае - таблицы
        int m = 2; // кол-во "строк"



        int indexedArray [] [] = new int[m][n]; // обявили
        //создали массив, и раздали индексы:
        for (int i=0; i < 12; i++) {
            indexedArray[0][i] = i;
            indexedArray[1][i] = (int) Math.floor(Math.random() * 31 - 15) ;
        }
        //отобразили
        System.out.println("\nСлучайно сгенерированный массив :\n");
        for (int i=1; i < m; i++) {
            for (int j=0; j < n; j++) {
                System.out.print(indexedArray[i][j]+"\t\t");
            }
        }
        //отсортировали, нашли кто из них наибольший:
        int temp0, temp1;
        boolean t = true;
        while (t == true)
            {
                t = false;
                for (int i=0; i <(n-1); i++) //при сортировке надо цикл проходить на 1 элемент меньше чем максимальный. чтобы не сравнивать крайний с несуществующим крайний+1
                {
                    if (indexedArray[1][i] < indexedArray[1][i+1])
                    {
                        temp1 = indexedArray[1][i+1];
                        temp0 = indexedArray[0][i+1];
                        indexedArray [1][i+1] = indexedArray [1][i];
                        indexedArray [0][i+1] = indexedArray [0][i];
                        indexedArray [1][i] = temp1;
                        indexedArray [0][i] = temp0;
                        t=true;
                    }
                }
            }

// вывод отосртированного массива. для задачи не требуется

/*
        System.out.println("\n");
        System.out.println("Отсортированный массив :");
        for (int i=1; i < m; i++) {
            System.out.println();
            for (int j=0; j < n; j++) {
                System.out.print(indexedArray[i][j]+"\t\t");
            }
        }
*/


        //показали:
        System.out.println("\n");
        System.out.println("Максимальный элемент масива: \""+indexedArray[1][0]+"\", его индекс: \""+indexedArray[0][0]+"\"");

        System.out.println("* Если максимальных элементов больше одного - показан индекс первого из них в массиве");


    }
}
