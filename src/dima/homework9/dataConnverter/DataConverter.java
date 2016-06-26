package dima.homework9.dataConnverter;

import java.util.Scanner;

import static dima.homework9.dataConnverter.ClassDataConverter.sBinary;
import static dima.homework9.dataConnverter.ClassDataConverter.sDecimal;

/**
 * Created by dmitriy on 05.06.16.
 */
public class DataConverter {
    public static void main(String[] args) {
        System.out.println("Вевдите двоичное число");
        Scanner sc = new Scanner(System.in);
        sDecimal = sc.nextLine();
        System.out.println(ClassDataConverter.BinaryToHex(sBinary));
        System.out.println(ClassDataConverter.HexToDecimal(sDecimal));

    }
}
