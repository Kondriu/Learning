package dima.lessons;

/**
 * Created by dmitriy on 14.05.16.
 */
public class IfElse {

    public static void main(String[] args) {

        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("X меньше");

        x=x*2;
        if (x == y) System.out.println("Х и У равны");

        x=y*2;
        if (x > y) System.out.println("X больше");

        x = y;
        if (x == y) System.out.println("nothing");


        int month = 9; //апрель
        String season;

        if (month == 12 || month == 1 || month == 2)
           season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Sprin";
        else if (month==6||month==7||month==8)
            season = "Simmer";
        else if (month==9||month==10||month==11)
            season="Autumn";
        else season="Ересь";

        System.out.println("месц относится к сезону " + season + ".");


        for (int i =0; i<6; i++)
            switch (i){
                case 0:
                    System.out.println("i равно " + i);
                    break;
                case 1:
                    System.out.println("i равно " + i);
                    break;
                case 2:
                    System.out.println("i равно " + i);
                    break;
                case 3:
                    System.out.println("i равно " + i);
                    break;
                case 4:
                    System.out.println("i равно " + i);
                    break;
                case 5:
                    System.out.println("i равно " + i);
                    break;




            }






    }
}
