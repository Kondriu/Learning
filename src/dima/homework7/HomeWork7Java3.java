package dima.homework7;

import java.util.Timer;

/**
 * Created by dmitriy on 29.05.16.
 * Написать программу которая сравнивает скорость выполнения добавления строк
 * с помощью String, StringBuilder, StringBuffer.
 * В цикле добавить к строке 100000 строк.
 * Отдельно цикл для каждого из вариантов
 * + вывести на экран время выполнения каждого цикла ( в миллисекундах).
 */
public class HomeWork7Java3 {
    public static void main(String[] args) {

        System.out.println("сравниваем работу String, StringBuilder, StringBuffer");
        int count = 100000;
        long timeStart, timeEnd;


        System.out.println("Метод String:");
        timeStart = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i<=count; i++){
            str += "test string ";
        }
//        System.out.println(str);
        timeEnd = System.currentTimeMillis() - timeStart;
        System.out.println(timeEnd+" mil.sec");


        System.out.println("Метод StringBuilder:");
        str = "";
        timeStart = System.currentTimeMillis();
        StringBuilder strbldr = new StringBuilder();
        for (int i = 0; i <=count; i++) {
            strbldr.append("test string ");
        }
        str=strbldr.toString();
//        System.out.println(str);
        timeEnd = System.currentTimeMillis() - timeStart;
        System.out.println(timeEnd+" mil.sec");



        System.out.println("Метод StringBuffer:");
        str = "";
        timeStart = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i =0; i<=count; i++){
            stringBuffer.append("test string ");
        }
        str = stringBuffer.toString();
//        System.out.println(str);
        timeEnd = System.currentTimeMillis() - timeStart;
        System.out.println(timeEnd+" mil.sec");

    }
}
