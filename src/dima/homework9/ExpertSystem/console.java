package dima.homework9.ExpertSystem;

import java.io.IOException;
import java.util.Scanner;

import static dima.homework9.ExpertSystem.Teacher.*;
import static myClases.MyFile.deleteStringOfFile;

/**
 * Created by dmitriy on 28.06.16.
 */
public class console {
    public static void main(String[] args) throws IOException {
        /*
        System.out.println("выберите какое дейсвтие хотите сделать:");
        System.out.println("\t1 - чтобы добавить учителя");
        System.out.println("\t2 - чтобы добавить учителя");
        */

        //switch ()

/*
        System.out.println("добавить учителя");
        addTeacher();
*/

        //System.out.println("найти пр. по иммени");
        //findTeacherByFirstName();

/*        findTeacherByLastName();
        findTeacherByLastName();*/

        System.out.println("найти по имени и фамилии");
        displayFindTeacher();

        //deleteTeacher();




    }
}
