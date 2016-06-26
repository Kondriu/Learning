package book.clases.box4;

/**
 * Created by dmitriy on 09.06.16.
 */
public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // инициализировать каждый экзмпляр
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        //получить объем первого
        vol = mybox1.volume();
        System.out.println("vol 1: "+ vol);

        vol = mybox2.volume();
        System.out.println("vol 2: " + vol);

    }

}
