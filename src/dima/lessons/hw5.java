package dima.lessons;

/**
 * Created by dmitriy on 22.05.16.
 *
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 * Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
public class hw5 {

    public static void main(String[] args) {

/*        int n = 12;
        int m = 2;*/
        int a = 1;
        int diff;
        int indexedArray []  = new int[12];
        int temp0;
        boolean t = true; // перменная используется в цикле   "while (t == true)" если задать false = то он даже не запуститься

        System.out.println("\n");
        System.out.println("начальный массив :");
        for (int i=0; i < 12; i++) {
            indexedArray[i] = (int) Math.floor(Math.random() * 31 - 15) ;
            System.out.print(indexedArray[i]+"\t\t");

        }
        System.out.println("\n");


        while (t == true)
        {

            t = false;
            for (int i=0; i <(indexedArray.length-1); i++)
            {
                if (indexedArray[i] < indexedArray[i+1])
                {
                    temp0 = indexedArray[i+1];
                    indexedArray [i+1] = indexedArray [i];
                    indexedArray [i] = temp0;
                    t=true;
                    System.out.print(indexedArray[i]+"\t\t");
                    System.out.println(t);

                }
            }
        }


        System.out.println("\n");
        System.out.println("финальный массив :");
        for (int i=0; i < 12; i++) {
                System.out.print(indexedArray[i]+"\t\t");
            }



    }
}
