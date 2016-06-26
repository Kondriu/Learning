package dima.homework5;


/**
 * Created by dmitriy on 22.05.16.
 */
public class HomeWork5Java1 {

    public static void main(String[] args) {

        /*
        Delete not alphabetical symbols from char array
        */

        char letters [] = new char[30];

// для обеспечения красоты:
        System.out.println("\n");
        for (int i=0; i < letters.length*4; i++){
        System.out.print("-");
        }
        System.out.println("\n");
// рендом генерация массива:
        for (int i=0; i < letters.length; i++){
            letters[i] = (char) Math.floor(Math.random() * 1000);
            System.out.print(letters[i]+"\t");
        }
        System.out.print("| <--- Новый массив символов");
// для обеспечения красоты:
        System.out.println("\n");
        for (int i=0; i < letters.length*4; i++){
            System.out.print("-");
        }
        System.out.println("\n");

// Чистка массива от не алфавитных сивомолов
        for (int i=0; i < letters.length; i++) {

            if (letters[i] > 'A' && letters[i] < 'Z' || letters[i] > 'a' && letters[i] < 'z' || letters[i] > 'А' && letters[i] < 'Я' || letters[i] > 'а' && letters[i] < 'я')
//  с числами: if (letters[i] > 'A' && letters[i] < 'Z' || letters[i] > 'a' && letters[i] < 'z' || letters[i] > 'А' && letters[i] < 'Я' || letters[i] > 'а' && letters[i] < 'я'|| letters[i] > '0' && letters[i] < '9')
            {
//                System.out.print(letters[i] + ", ");
            } else letters[i]=' '; //т.к. конкретно удалить из массива элемент нельзя - его просто заменяем на пробел
            System.out.print(letters[i]+"\t");
        }
        System.out.print("| <--- Массив с удаленными символами не-буквами");

// для обеспечения красоты:
        System.out.println("\n");
        for (int i=0; i < letters.length*4; i++){
            System.out.print("-");
        }
        System.out.println("\n");
        System.out.println("--------конец--------");

    }
}
