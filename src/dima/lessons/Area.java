package dima.lessons;

/**
 * Created by dmitriy on 14.05.16.
 */
public class Area {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8;
        pi = 3.14;
        a = pi*r*r;
        System.out.println("Плoщaдь круга равна " +a);


        char ch1, ch2, ch3 ;
        ch1 = 88; // код символа Х
        ch2 = 'Й'; //можно только один символ

        System.out.print("ch1 + ch2: " );
        System.out.println(ch1 + " " + ch2);

        ch3 = 'A';
        System.out.println(" ch3 содержит "+ ch3 );

        int i;
        for (i=0; i<5; i++){
            ch3++;
            System.out.println(" ch3 теперь содержит "+ ch3 );
        }

        boolean w;

        w = false;
        System.out.println("w равно " + w);
        w = true;
        System.out.println("w равно " + w);

        if(w) System.out.println("этот код исполняется   ");
        w = false;
        if(w) System.out.println("этот код не выполняется   ");

        System.out.println("10 > 9 \n равно " + (10 < 9));


/***
\ddd Восьмеричный символ ( ddd)
\' Одинарная кавычка
\" Двойная кавычка
\\ Обратная косая черта
\r Возврат каретки
\n Новая строка (или перевод строки)
\f Подача страницы
\t Табуляция
\Ь Возврат на одну позицию ( "забой")



     */

    }
}
