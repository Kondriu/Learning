package book.clases.box1;

/**
 * Created by dmitriy on 08.06.16.
 */
public class BoxDemo2 {
    public static void main(String[] args) {

        Box mybox1 = new Box();

        // mybox2 можно (нужно) объяивть и как mybox1, так как-то тупее.
        Box mybox2; //обявить ссылку на обект
        mybox2 = new Box();  // выделить память для обьекта Box

        double vol;

        // присвоить значение переменным экземпляра mуbох1
        mybox1.wight = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить значение переменным экземпляра mуbох2
        mybox2.wight = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = (double) mybox1.depth * mybox1.height * mybox1.wight;
        System.out.println("Обем 1 равен: "+vol);

        vol = mybox2.depth * mybox2.height * mybox2.wight;
        System.out.println("Обем 2 равен: "+vol);


    }
}
