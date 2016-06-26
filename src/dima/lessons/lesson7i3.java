package dima.lessons;

import java.util.Scanner;

/**
 * Created by root on 5/26/16.
 */
public class lesson7i3 {
    public static void main(String[] args) {

        //ввод слова для зашифровки
        System.out.println("Enter new word:");
        Scanner sc = new Scanner(System.in);
        String strMessage = sc.nextLine();
        System.out.println("введеное слово: " + strMessage);
        System.out.println("шифр-ное слово: " + stringEncode(strMessage));

    } //МЕТОД МАИН ТУТ И ЗАКОНЧИЛСЯ. дальше пойдут другие методы


        //создать метод. кторый будет шифровать строку и возвращать зашифрованное знчение

        public static String stringEncode (String strMessage)
    {
            //метод использует где-то созданную и наполненную строку "strMessage"
            //что-то с ней делает и возвращает результат тсвоих дейсвий в String "strToMessage" - там должно быть зашифрованное слово

            // это два массива - один "оригинальный" втрой перемешанный. в введенном слове будут меняться буквы из оригинального
            // масива на буквы из перемешанного

            String firstStr = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789 ";
            String secndStr = "1QAZ2WSX3EDC4RFV5TGB6YHN7UJM8IK9OL0P qazwsxedcrfvtgbyhnujmikolp";

            //  String.charAt();

            StringBuilder bldr = new StringBuilder(strMessage); // передали введенную строку методу StringBuilder

            for (int i = 0; i < bldr.length(); i++)  //первый цикл, длинной во введенную строку.
            // здесь будет перебираться введенная строка
            {
                for (int j = 0; j < firstStr.length(); j++) // второй, вложенный цикл. длинной в массив оригинальных символов
                //здесь будет искаться соотвестсвия введенной строки и массива оригинальных символов. чтобы получить индекс символа из массива
                {
                    if (bldr.charAt(i) == firstStr.charAt(j)) {
                        bldr.setCharAt(i, secndStr.charAt(j));
                        break;
                    }
                }

            }
        return bldr.toString();
    }


}
