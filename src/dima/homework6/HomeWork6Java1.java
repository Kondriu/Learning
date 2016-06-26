package dima.homework6;

import java.util.Scanner;

/**
 * Created by dmitriy on 20.06.16.
 * Delete all spaces from String
 */
public class HomeWork6Java1 {
    public static void main(String[] args) {
        System.out.println("ввести строку");
        Scanner scanner=new Scanner(System.in);
        String string = scanner.nextLine();
        char str[] = string.toCharArray();
        String str2 = new String();
        for (int i = 0; i < string.length(); i++){
            if (str[i] != ' '){
                str2 += str[i];
            }
        }
        System.out.println(str2);
    }
}
