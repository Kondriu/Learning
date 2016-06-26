package dima.homework7;

import java.util.Scanner;

/**
 * Created by dmitriy on 28.05.16.
 * Create a program to implement “ceaser cipher” (2 метода encode \ decode)
 */

public class HomeWork7Java2 {
    public static void main(String[] args) {
        System.out.println("пример работы алгоритма “ceaser cipher”...");
        System.out.println("Введите фразу: ");

        int shift = 2; // задаем смещениеThe syntax shown above includes:
        int startCharOfAlphabet = 'A';
        int endCharOfAlphabet   = 'z';
        int range = endCharOfAlphabet-startCharOfAlphabet;
        Scanner sc1 = new Scanner(System.in);
        String message = sc1.nextLine();


        String encryptedMessage = Еncript(message, shift, range);
        String decryptedMessage = Decript(message, shift, range);


        System.out.println("вы ввели: \t\""+message+"\""+"\n"+"шифровка:\t\""+encryptedMessage+"\""+ "\n"+"дешифровка:\t\""+decryptedMessage+"\"");
    }


    public static String Еncript(String message, int shift, int range) {
        StringBuilder result = new StringBuilder(message);

        //создаем массив состоящий из алфавита.
        //для упрощения не выкидывал "не-алфавитные" символы
        char alphabetNormal[] = new char[range+1];
        for (int i = 0; i < alphabetNormal.length; i++){
            int symbol0 = 'A'+i;
            char let0 = (char) symbol0;
            alphabetNormal[i] = let0;
        }

        //создаем "алфавит", со смещением
        int a=0;
        char alphabetShifted[] = new char[range+1];
        for (int i = 0; i < alphabetShifted.length-shift; i++){

            int symbol1 = 'A'+i+shift;
            char let1 = (char) symbol1;

            alphabetShifted[i] = let1;
        }
        for (int k=alphabetShifted.length-shift; k<alphabetShifted.length; k++){
            int symbol2 = 'A'+a;
            char let2 = (char) symbol2;
            alphabetShifted[k] = let2;
            a++;
        }

//----------------сама логика работы:
        for (int i=0; i<result.length(); i++){
            for (int j = 0; j<alphabetNormal.length; j++){
                if (result.charAt(i) == alphabetNormal[j]){
                    result.setCharAt(i,alphabetShifted[j]);
                    break;
                }
            }
        }
//---------------возврат из метода, данных:
        return result.toString();
    }

    public static String Decript(String message, int shift, int range) {

        //создаем массив состоящий из алфавита.
        //для упрощения не выкидывал "не-алфавитные" символы
        char alphabetNormal[] = new char[range+1];
        for (int i = 0; i < alphabetNormal.length; i++){
            int symbol0 = 'A'+i;
            char let0 = (char) symbol0;
            alphabetNormal[i] = let0;
        }

        //создаем "алфавит", со смещением
        int a=0;
        char alphabetShifted[] = new char[range+1];
        for (int i = 0; i < alphabetShifted.length-shift; i++){

            int symbol1 = 'A'+i+shift;
            char let1 = (char) symbol1;

            alphabetShifted[i] = let1;
        }
        for (int k=alphabetShifted.length-shift; k<alphabetShifted.length; k++){
            int symbol2 = 'A'+a;
            char let2 = (char) symbol2;
            alphabetShifted[k] = let2;
            a++;
        }
        StringBuilder result = new StringBuilder(message);

        for (int i=0; i<result.length(); i++){
            for (int j =0; j<alphabetShifted.length; j++){
                if (result.charAt(i)==alphabetShifted[j]){
                    result.setCharAt(i,alphabetNormal[j]);
                }
            }
        }
        return result.toString();
    }
}
