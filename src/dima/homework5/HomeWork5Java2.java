package dima.homework5;

/**
 * Created by dmitriy on 22.05.16.
 * Написать 4х мерный массив размерности 10, 10, 10, 10 заполнить его числами по возростанию и вывести его в консоль.
 */

public class HomeWork5Java2 {

    public static void main(String[] args) {

        int arrayContent = 1;
        int n = 10;

        int coubeArray [] [] [] [] = new int[n][n][n][n];
        //char coubeArray [] [] [] [] = new char[n][n][n][n];

        for (int i=0; i < n; i++) { // размерность 1
            System.out.println("++++++++++++++++++++++++++++++++++++++++++ -= Размерность 1, таблица"+(i+1)+": =- ++++++++++++++++++++++++++++++++++++++++++++++++++\n");

            for (int j = 0; j < n; j++) {  // размерность 2
                System.out.println("========================================== -= Таблица "+(j+1)+" Размерности 2 =- ==============================================================\n");
                for (int h = 0; h < n; h++) { // размерность 3
                    for (int k = 0; k < n; k++) { // размерность 4
                        coubeArray[i][j][h][k] = arrayContent;
                        //coubeArray[i][j][h][k] = (char) Math.floor(Math.random() * 1000);
                        arrayContent++;
                        System.out.print("\t"+coubeArray[i][j][h][k]);
                    }
                       System.out.println("\n");

                }
                System.out.println("======================================== -= Конец таблицы "+(j+1)+" Размерности 2 =- ============================================================\n");
            }
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++ -= Конец таблицы "+(i+1)+" Размерности 1 =- +++++++++++++++++++++++++++++++++++++++++++++++");
        }

    }
}
