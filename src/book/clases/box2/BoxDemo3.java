package book.clases.box2;

/**
 * Created by dmitriy on 08.06.16.
 */
public class BoxDemo3 {
    public static void main (String [] args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        Box mybox3 = new Box();        //отсебятина

        //присвоить значения переменным экземпляра mybox1
        mybox1.wight = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присвоить другие значения переменным экземпляра mybox2

        mybox2.wight = 3;
        mybox2.height = 5;
        mybox2.depth = 7;

        //вывести обьем первого
        mybox1.volume();

        //вывести обьем второго
        mybox2.volume();

        //отсебятина
        mybox3.volume();

    }
}
