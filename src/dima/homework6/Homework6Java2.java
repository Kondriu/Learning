package dima.homework6;

/*import myClases.Usage;
import static myClases.Usage.input;
*/

import java.util.Scanner;

/**
 * Created by dmitriy on 20.06.16.
 * Input String from keyboard.
 * If word “new” is present in string – print part of the string after this word.
 * Example: in = “Brave new world” out = “ world”
 */
public class Homework6Java2 {
    public static void main(String[] args) {

        System.out.println("Input String from keyboard");

        String string = new String();
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();

        StringBuffer str = new StringBuffer();
        str = str.append(string);

        do {
            int index = str.indexOf("new");
            System.out.println(index);
            str.delete(0, (index + 3));
            System.out.println(str);
        } while (str.indexOf("new") != -1);
    }
}
