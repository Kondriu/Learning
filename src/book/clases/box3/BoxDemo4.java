package book.clases.box3;

/**
 * Created by dmitriy on 09.06.16.
 */
public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.wight = 2;
        mybox1.height = 3;
        mybox1.depth = 4;

        mybox2.wight = 1;
        mybox2.height = 1;
        mybox2.depth = 2;

        vol = mybox1.volume();
        System.out.println("volume 1 is: " + vol);

        System.out.println("volume 2 is: " + mybox2.volume());

    }
}

