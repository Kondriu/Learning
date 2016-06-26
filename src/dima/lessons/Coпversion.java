package dima.lessons;

/**
 * Created by dmitriy on 15.05.16.
 */
public class Coпversion {

    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\n Преобразование типа int в тип byte.");
        b = (byte) i;
        System.out.println("i and b: " + i + " " + b);

        System.out.println("\n преобразование типа double в тип int.");
        i = (int) b;
        System.out.println("d and i: " + d + " " + i);

        System.out.println("\n преобразование типа double в тип byte");
        b = (byte) i;
        System.out.println("d and b: " + d + " " + b);


    }
}
