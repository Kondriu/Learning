package myClases;

import java.util.Scanner;

/**
 * Created by dmitriy on 20.06.16.
 */
public class Usage {

    public static String input (){

        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }

    public static String deleteSpacesInString(String s) {
        StringBuilder strBld = new StringBuilder();
        strBld.append(s);
        do {
            int a = strBld.indexOf(" ");
            strBld.deleteCharAt(a);
        } while (strBld.indexOf(" ") != -1);
        return strBld.toString();
    }
}
