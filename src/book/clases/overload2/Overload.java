package book.clases.overload2;

import book.clases.overload1.OverLoadDemo1;

/**
 * Created by dmitriy on 09.06.16.
 */
public class Overload {
    public static void main(String[] args) {

        OverLoadDemo2 ob = new OverLoadDemo2();
        int i = 88;

        //вызвали все варинаты метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        ob.test(i); //вариант метода test(double) да, потому что с одной цифрой есть только один метод в OverLoadDemo. и эта цифра типа дабл
        ob.test(123.2); //вариант метода test(double)
    }
}
