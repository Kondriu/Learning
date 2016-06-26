package dima.homework5;

import java.util.Scanner;

/**
 *Программа генерирует рандомное число в диапазоне от 0 до 100
 Юзер из консоли вбивает целое число в пределах этого диапазона (проверять что оно в пределах!)
 Компьютер 1(тоже игрок) генерирует рандомное число от 0 до 100 себе.
 Победа достается тому (игроку или компьютеру1) у кого число ближе к сгенерированому изначально
 Пример:
 Программа (игра) сгенерировала число 7
 Игрок ввел в консоль число 20
 Компьютер 1 сгенерировал число 90

 Результат: Победил Игрок! Программа = 7, Игрок = 20, Компьютер 1 = 90
 */
public class HomeWork5Java7 {
    public static void main(String[] args) {
        int goalRandom;
        int userInput;
        int computerInputRandom;

        goalRandom = (int) (Math.random()* 101);
       // System.out.println(goalRandom);
        System.out.println();

        System.out.println("Введите число от 0 до 100:");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
        if (userInput < 0)
        {
            System.out.println("вы ввели ввели число меньше 0");

        } else if (userInput > 100) {
            System.out.println("вы ввели ввели число больше 100");
        } else
            {
            System.out.println("вы ввели ввели число:" + userInput);
            computerInputRandom = (int) (Math.random()*101);
            int dif1 = Math.abs(goalRandom-userInput); //получаем разницу между числами, для сравнения. Берем модуль на случай если разница ушла в минуса
              //  System.out.println(dif1);
            int dif2 = Math.abs(goalRandom-computerInputRandom); //получаем разницу между числами, для сравнения. Берем модуль на случай если разница ушла в минуса
              //  System.out.println(dif2);
                    if (dif1 < dif2) //сравниваем разницы
                        {
                            System.out.println("Победил Игрок! Программа = "+goalRandom+", Игрок = "+userInput+", Компьютер 1 = "+computerInputRandom);
                        } else
                                {
                                    System.out.println("Победил Компьютер! Программа = "+goalRandom+", Игрок = "+userInput+", Компьютер 1 = "+computerInputRandom);
                                }
            }

    }
}
