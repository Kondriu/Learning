package dima.homework9.ExpertSystem;

import java.util.Scanner;

/**
 * Created by dmitriy on 28.06.16.
 */
public abstract class Human {
    protected static String firstName;
    protected static String lastName;
    protected static String science;
    protected static String PathTeacher = "/home/dmitriy/Рабочий стол/Expert/teacher.txt";
    protected static String PathStudent = "/home/dmitriy/Рабочий стол/Expert/student.txt";
    protected static String PathGroup = "/home/dmitriy/Рабочий стол/Expert/group.txt";


    protected static void setScience(String sc){
        science = sc;
    }
    protected static String getScience(){
        return science;
    }

    protected static void setFirstName(String fn){
        firstName = fn;
    }
    protected static String getFirstName(){

        return firstName;
    }
    protected static void setLastName(String ln){
        lastName = ln;
    }
    protected static String getLastName(){
        return lastName;
    }

    public static void enterPersonFirstName () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String fn = scanner.nextLine();
        setFirstName(fn);
    }
    protected static void enterPersonLastName (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter last name");
        String fl = scanner.nextLine();
        setLastName(fl);
    }

    public static void enterScience (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter science");
        String sc = scanner.nextLine();
        setScience(sc);

    }



}
