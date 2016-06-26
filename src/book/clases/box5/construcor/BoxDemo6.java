package book.clases.box5.construcor;

/**
 * Created by dmitriy on 09.06.16.
 */
public class BoxDemo6 {
    public static void main(String[] args) {
        //обявить и выделить памаять обектам типа Box
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

       //получить объемы
        System.out.println("vol 1: "+ mybox1.volume());
        System.out.println("vol 2: "+ mybox2.volume());


    }
}
