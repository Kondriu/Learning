package book.clases.box7this;

/**
 * Created by dmitriy on 09.06.16.
 * Иногда требуется, чтобы метод ссылался на вызвавший его объект. Для этой
 * цели в java определено ключевое слово "this".
 */
public class BoxDemo8 {
    public static void main(String[] args) {
        //обявить и выделить памаять обектам типа Box
        Box mybox1 = new Box(3, 6, 9);
        Box mybox2 = new Box(10, 15, 20);

        //получить объемы
        System.out.println("vol 1: "+ mybox1.volume());
        System.out.println("vol 2: "+ mybox2.volume());


    }
}
