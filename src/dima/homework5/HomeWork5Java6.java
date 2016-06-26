package dima.homework5;

import java.util.Scanner;

/**
 * Created by dmitriy on 25.05.16.
 * Написать программу для транслитерации.
 * Пример: вы вводите в консоль слово на русском “Привет”, вам программа выводит: “Privet”
 * (Данную программу делать с помощью 2х массивов с символами)

 */
public class HomeWork5Java6 {
    public static void main (String args[] )
    {

        char lat[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'J', 'j', 'S', 's', 'S', 's', 'C', 'c', 'J', 'j', '*', '*'};
        char cyr[] = {'А', 'Б', 'Ц', 'Д', 'Е', 'Ф', 'Г', 'Х', 'И', 'Я', 'К', 'Л', 'М', 'Н', 'О', 'П', 'К', 'Р', 'С', 'Т', 'Ю', 'В', 'В', 'Х', 'У', 'З', 'а', 'б', 'ц', 'д', 'е', 'ф', 'г', 'х', 'и', 'я', 'к', 'л', 'м', 'н', 'о', 'п', 'к', 'р', 'с', 'т', 'ю', 'в', 'в', 'х', 'у', 'з', 'Ы', 'ы', 'Ш', 'ш', 'Щ', 'щ', 'Ч', 'ч', 'Ж', 'ж', 'ь', 'ъ'};


        System.out.println("введите слово eng: ");
        Scanner sc = new Scanner(System.in);
        String inpt = sc.nextLine();
        System.out.println();
        System.out.println("вы ввели: "+inpt);

        int l=inpt.length();
//        System.out.println("кол-во символов = "+l);

        char letter = (char) inpt.charAt(0);
        if (letter >= 0x0041 && letter <= 0x007a) // англ афавит в юникоде
            {
                for (int i =0; i<lat.length; i++)
                {
                    inpt = (String) inpt.replace(lat[i], cyr[i]);
                }
                System.out.println();
                System.out.println(inpt);

            } else if (letter >= 0x0400 && letter < 0x0450) // рксс алфавит в юникоде
                    {
                        for (int i =0; i<lat.length; i++)
                        {
                            inpt = (String) inpt.replace(cyr[i], lat[i]);
                        }
                        System.out.println();
                        System.out.println(inpt);
                    } else {
                            System.out.println("\n введено непонятне слово"); // на пример укр "їж борщь"
                            }
    }
}
