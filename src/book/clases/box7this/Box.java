package book.clases.box7this;

/**
 * Created by dmitriy on 09.06.16.
 */
public class Box {
    double wight;
    double height;
    double depth;

    //конструктор класса Box
    Box (double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    //посчитать и возвратить объем
    double volume () {
        return height * depth * wight;
    }
}
