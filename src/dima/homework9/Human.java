package dima.homework9;

/**
 * Created by dmitriy on 10.06.16.
 */
public class Human {
    protected String name;
    protected String familyName;
    protected String age;
    protected String sex;
    protected String status;

    // constructor
/*    protected Human(){
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.sex = sex;
    }*/

    protected void setName (String n){
        name = n;
    }
    protected void setFamilyName (String f){
        familyName = f;
    }

    protected  void setAge (String a){
        age = a;
    }

    protected void setSex (String s){
        sex = s;
    }
    protected void setStatus (String st){
        status = st;
    }

    protected static String sayName (String name){
        return ("My name is "+ name);
    }

    protected static  String sayFamilyName (String familyName){
        return ("My family name is "+ familyName);
    }

    protected static String sayFullName (String name, String familyName){
        return ("I`m "+ name +" "+familyName);
    }

    protected static String sayAge (String age){
        return ("My age is "+ age);
    }

    protected static String saySex (String sex){
        return ("I`m "+ sex);
    }
    protected static String sayStatus (String status){
        return ("I`m a "+ status);
    }
    protected String getResponse(String question){
        return "Что? ";
    }
    public static String humanSayHello (String name, String familyName, String age){
        return ("Hello! \n"+sayFullName(name, familyName)+", "+sayAge(age));
    }




}
