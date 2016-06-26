package dima.homework7;

import myClases.vkBot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Написать программу которая собирает все сообщения из всех переписок в вк,
 * добавляет их в строку и выводит эту строку на экран. (все сообщения разделять в строке символами “|||”)
 * После сбора записать каждое сообщение в массив строк и вывести на экран количество собранных сообщений.
 * (размер массива).
 */
public class HomeWork7Selenium1 extends vkBot {

    public static ArrayList membersID = new ArrayList();
    public static ArrayList membersFirstName = new ArrayList();
    public static ArrayList membersLastName = new ArrayList();

    public static ArrayList messageList = new ArrayList();
    public static ArrayList messageListByPerson = new ArrayList();


    public static void main(String[] args) throws InterruptedException {
        //использую уже готовый логин

        //loginKilgor();
        loginDima();
        Thread.sleep(1000);
        createFullMembersList();

        for (int i =0; i<membersID.size(); i++){
            System.out.println("----"+membersFirstName.get(i)+" "+membersLastName.get(i)+"----");
            createMessageList(i);
            //messageListByPerson

        }

        int a=1;
        for (int j = 0; j < messageList.size(); j++ ){
            a++;
        }
        System.out.println("всего месаг собрано: "+a);

/*        for (int i = 0; i < membersID.size(); i++ ){
            System.out.print(membersID.get(i)+"\t\t"+ membersFirstName.get(i) +" "+membersLastName.get(i)+"\n");
        }
*/
        driver.close();
    }

    public static void createMessageList (int indexID){
        driver.get("http://vk.com/im?sel="+ membersID.get(indexID)); //открываются страницы с пеерпиской (доставляя ID пользователя)

        StringBuffer str2 = new StringBuffer(driver.getPageSource());



        StringBuffer sss = new StringBuffer();
        int z=0;
        while (str2.indexOf("<div class=\"im_msg_text\">") != -1) // цикл в котором, коде страницы, по тегам находятся мессаги, и обрезаются все кроме них
        {
            sss.append("||| ");
//            System.out.println("начало цикла поиска");
//            System.out.println("-получаем индексы-");
            int a1 = str2.indexOf("<div class=\"im_msg_text\">")+25;
            int a2 = str2.indexOf("</div>", str2.indexOf("<div class=\"im_msg_text\">"));
//            System.out.println("-получаем подстроку-");
            String a = str2.substring(a1, a2);
//            System.out.println("-получили подстроку-");
//            System.out.println(a);
//            System.out.println("-добавляем подстроку в массив-");
            messageList.add(z, a);


//            System.out.println("-добавили подстроку в массив-");
//            System.out.println("------");
//            System.out.println("-удаляем начало-");
            str2.delete(0,((str2.indexOf("<div class=\"im_msg_text\">"))+25));
//            System.out.println("-удалили начало-");
            z++;
            System.out.println(sss);
        }

/*
        messageListByPerson.add(stringI);

        for (int i=0; i <messageListByPerson.size(); i++){
            System.out.println(messageListByPerson.get(i));
        }

*/

    }

    public static void createFullMembersList(){
        String ml = getMembersList();
        String dialogMembersArray[] = ml.split("},");
        for (int i = 0; i < dialogMembersArray.length; i++ ){
            StringBuffer strBuf = new StringBuffer(dialogMembersArray[i]);
            membersID.add(i,strBuf.substring(1,(strBuf.indexOf(":{")-1)));
            membersFirstName.add(i,strBuf.substring((strBuf.indexOf("\"first_name\":")+14),strBuf.indexOf("\",")));
            membersLastName.add(i,strBuf.substring(strBuf.indexOf("last_name\":\"")+12,strBuf.indexOf("\",\"sex")));

        }
    }

    public static void createMembersIdList(){
        String ml = getMembersList();
        String dialogMembersArray[] = ml.split("},");
        for (int i = 0; i < dialogMembersArray.length; i++ ){
            StringBuffer strBuf = new StringBuffer(dialogMembersArray[i]);
            membersID.add(i,strBuf.substring(1,(strBuf.indexOf(":{")-1)));
        }
    }

    public static String getMembersList(){
        driver.get("http://vk.com/im");
        String pageSorce = driver.getPageSource();
        StringBuilder listPage = new StringBuilder(pageSorce);
        listPage.delete(0,(listPage.indexOf("dialogs_members")+18));
        listPage.delete((listPage.indexOf("}}});")),listPage.length());

        return listPage.toString();
    }
}
