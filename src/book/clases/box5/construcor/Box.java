package book.clases.box5.construcor;

/**
 * Created by dmitriy on 09.06.16.
 */
public class Box {
    double wight;
    double height;
    double depth;

    //конструктор класса Box
    Box () {
        System.out.println("конструировнаие обьекта Box"); //просто для отладки. обычно подобный вывод нах не надо
        wight = 10;
        height = 10;
        depth = 10;
    }

    //посчитать и возвратить объем
    double volume () {
        return height * depth * wight;
    }
}
