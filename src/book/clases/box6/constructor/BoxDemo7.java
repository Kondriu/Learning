package book.clases.box6.constructor;

/**
 * Created by dmitriy on 09.06.16.
 */

public class BoxDemo7 {
    public static void main(String[] args) {
        //обявить и выделить памаять обектам типа Box
        Box mybox1 = new Box(3, 6, 9);
        Box mybox2 = new Box(10, 15, 20);

        //получить объемы
        System.out.println("vol 1: "+ mybox1.volume());
        System.out.println("vol 2: "+ mybox2.volume());


    }
}
