package dima.homework7;

import java.util.Scanner;

/**
 * Created by dmitriy on 28.05.16.
 * дописать алгортм энигмы
 */

public class HomeWork7Java1 {
    public static void main(String[] args) {

        boolean t = true;
        while (t=true) {
            t=false;
            System.out.println("Введите 1, если хотите зашифровать фразу\nВведите 2, если хотите зашифровать фразу\nИли \"3\"для выхода ");
            Scanner sc0 = new Scanner(System.in);
            int chose = sc0.nextInt();
            if (chose == 1)
            {//ввод для зашифровки
                System.out.println("ВВедите фразу для зашифровки:");
                Scanner sc1 = new Scanner(System.in);
                String strMessage = sc1.nextLine();
                System.out.println("введеное слово: \"" + strMessage+"\"");
                System.out.println("шифр-ное слово: \"" + Encrypt(strMessage)+"\"");

                t=true;
            } else  if (chose ==2 )
            {
                System.out.println("Введите фразу для расшифровки:");
                Scanner sc2 = new Scanner(System.in);
                String strMessage = sc2.nextLine();
                System.out.println("введеное слово: \"" + strMessage+"\"");
                System.out.println("разшиф-е слово: \"" + Decrypt(strMessage)+"\"");
                t=true;
            } else {
                break;
            }
        }




    } //МЕТОД МАИН ТУТ И ЗАКОНЧИЛСЯ. дальше пойдут другие методы


    //создать метод. кторый будет шифровать строку и возвращать зашифрованное знчение
    public static String Encrypt (String strMessage)
    {
        //метод использует "где-то" созданную и наполненную строку "strMessage"
        //"что-то" с ней делает, важное, и возвращает результат своих дейсвий в String "strToMessage" - там должно быть зашифрованное слово

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

    public static String Decrypt (String strMessage)
    {
        String firstStr = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm0123456789 ";
        String secndStr = "1QAZ2WSX3EDC4RFV5TGB6YHN7UJM8IK9OL0P qazwsxedcrfvtgbyhnujmikolp";
        StringBuilder bldr = new StringBuilder(strMessage);

        for (int i=0; i<strMessage.length(); i++) {
            for (int j=0; j<firstStr.length(); j++){
                if (strMessage.charAt(i) == secndStr.charAt(j)){
                    bldr.setCharAt(i, firstStr.charAt(j));
                    break;
                }
            }
        }
        return bldr.toString();
    }

}
