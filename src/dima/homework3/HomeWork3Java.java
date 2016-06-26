package dima.homework3;

import java.util.Scanner;

/**
 * Created by dmitriy on 15.05.16.
 */
public class HomeWork3Java {

    public static void main(String[] args) {


        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.println("Введите второе число");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.println("Введите третье число");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();

        System.out.println("Введите четвертое число");
        Scanner sc4 = new Scanner(System.in);
        int d = sc4.nextInt();


        if (a < b && a < c && a <d) {
            System.out.println("Наименьшее число: " +a+ ".");
            System.out.println("сумма трех из четырех чисел,  без наименьшего = " + (b+c+d));
        }
        else if (b < a && b < c && b < d){
            System.out.println("Наименьшее число: " +b+".");
            System.out.println("сумма трех из четырех чисел,  без наименьшего = " + (a+c+d));
        }
        else if (c < a && c < b && c < d){
            System.out.println("Наименьшее число: " +c+".");
            System.out.println("сумма трех из четырех чисел,  без наименьшего = " + (b+a+d));
        }
        else if (d < a && d < b && d < c){
            System.out.println("Наименьшее число: " +d+".");
            System.out.println("сумма трех из четырех чисел,  без наименьшего = " + (b+c+a));
        }
        else {
            System.out.println("Наименьших чисел несколько");
            if (a == b && a != c && a != d){
                System.out.println("Наименьшее число: " +a+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (c+d));
            }
            else if (a == c && a != b && a != d) {
                System.out.println("Наименьшее число: " +a+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (b+d));
            }
            else if (a == d && a != b && a != c) {
                System.out.println("Наименьшее число: " +a+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (b+c));
            }
            else if (b == c && d != b && a != b) {
                System.out.println("Наименьшее число: " +b+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (a+d));
            }
            else if (b == d && c != b && a != b) {
                System.out.println("Наименьшее число: " +b+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (a+c));
            }
            else if (c == d && a != b) {
                System.out.println("Наименьшее число: " +c+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (a+b));
            }
            else if (a == b && a == c && a != d){
                System.out.println("Наименьшее число: " +a+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (d));
            }
            else if (a == b && a == d  && a != c){
                System.out.println("Наименьшее число: " +a+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (c));
            }
            else if (a == c && a == d && a != b){
                System.out.println("Наименьшее число: " +a+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (b));
            }
            else if (b == c && b == d && a != d){
                System.out.println("Наименьшее число: " +b+ ".");
                System.out.println("сумма из чисел,  исключая наименьшие = " + (a));
            }
            else System.out.println("введены все одинаковые числа, равные: " +b+ ".");

        }


//        int a1,b1,c1,d1, e1;
        System.out.println("Введите пятое число");
        Scanner sc5 = new Scanner(System.in);
        int e = sc5.nextInt();

        int five[] = {a, b, c, d, e};
        sort(five);
        System.out.println("Минимальное число: " +five[0]);
        System.out.println("Максимальное число: " +five[4]);


        System.out.println("Введите первое имя:");
        Scanner sc6 = new Scanner(System.in);
        String name1 = sc6.next();

        System.out.println("Введите второе имя:");
        Scanner sc7 = new Scanner(System.in);
        String name2 = sc7.next();

        if (name1.equals(name2)) {  // нагуглил такой спопосб сравнивать строки.
            System.out.println("Люди тезки");
        }
        else {
            System.out.println("Имена разные");
        }

        System.out.println(name1);
        System.out.println(name2);

        System.out.println("Введите номер месяца:");
        Scanner sc8 = new Scanner(System.in);
        int month = sc8.nextInt();
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "Зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month==6||month==7||month==8)
            season = "Лето";
        else if (month==9||month==10||month==11)
            season="Осень";
        else season="Нет такого месяца";

        System.out.println("месц относится к сезону \"" + season + "\".");




        System.out.println("Введите число:");
        Scanner sc9 = new Scanner(System.in);
        double number = sc9.nextDouble();
        if((number%2)==0){  //Операция деления но модулю - надо покурить как работает. пока не поянл
            System.out.println("Число " + number + " четное ");
        } else System.out.println(" Число не четное");

        System.out.println("Введите название маесяца на английском с большой буквы:");
        Scanner sc10 = new Scanner(System.in);
        String mo = sc10.next();

//        for (int i =0; i<12; i++)
            switch (mo){
                case "January":{
                    System.out.println("Номер месяца \"January\" = 1");
                    break;
                }
                case "February":{
                    System.out.println("Номер месяца \"February\" = 2");
                    break;
                }
                case "March":{
                    System.out.println("Номер месяца \"March\" = 3");
                    break;
                }
                case "April":{
                    System.out.println("Номер месяца \"April\" = 4");
                    break;
                }
                case "May":{
                    System.out.println("Номер месяца \"May\" = 5");
                    break;
                }
                case "June":{
                    System.out.println("Номер месяца \"June\" = 6");
                    break;
                }
                case "July":{
                    System.out.println("Номер месяца \"July\" = 7");
                    break;
                }
                case "August":{
                    System.out.println("Номер месяца \"August\" = 8");
                    break;
                }
                case "September":{
                    System.out.println("Номер месяца \"September\" = 9");
                    break;
                }
                case "October":{
                    System.out.println("Номер месяца \"October\" = 10");
                    break;
                }
                case "November":{
                    System.out.println("Номер месяца \"November\" = 11");
                    break;
                }
                case "December":{
                    System.out.println("Номер месяца \"December\" = 12");
                    break;
                }
                default:
                    System.out.println("Месяц неопознан!");
                    break;
                }

        }

    //}


    //метод пузырьковой сортировки.
    public static void sort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }
}
