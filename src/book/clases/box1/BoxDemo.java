package book.clases.box1;

/**
 * Created by dmitriy on 08.06.16.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(); //после этого появиться один из экземпляров класса "Box". Экземпляр будет под названием "mybox"

        // присвоить значение переменным экземпляра mуЬох
        mybox.wight = 2;
        mybox.height = 3;
        mybox.depth = 4;

        //расчитать обем паралл-пипеда
        int vol = (int) (mybox.height * mybox.wight * mybox.depth);
        System.out.println("объем равен: "+vol);
    }
}
