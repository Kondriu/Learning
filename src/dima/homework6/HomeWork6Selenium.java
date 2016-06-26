package dima.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dmitriy on 20.06.16.
 */
public class HomeWork6Selenium {
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
/*9
        String s1 = getRatePrivatBank();
        System.out.println("\""+s1+"\"");
        */
        String privat = getRatePrivatBank();
        String s2 = deleteSpacesInString(getSellRatePrivatBank(privat));
        String s21= s2.substring(2,s2.length());
        double PrivatBankByeUSD = getDoubleFromString(s21);
        System.out.println("покупка \""+PrivatBankByeUSD+"\"");
        String s3 = deleteSpacesInString(getByeRatePrivatBank(privat));
        String s31= s3.substring(0,(s3.length()-2));
        double PrivatBankSellUSD = getDoubleFromString(s31);
        System.out.println("продажа \""+PrivatBankSellUSD+"\"");







        driver.close();
    }

    public static double getDoubleFromString (String s){

        double d = Double.parseDouble(s);
        return d;
    }
    public static String getSellRatePrivatBank (String s){
        String splitArray[] = s.split("/"); //создали массив из стрк, разбитых по разделителю (",")
        double numArr[] = new double[splitArray.length]; // массив для интов
        return splitArray[0];
    }
    public static String getByeRatePrivatBank (String s){
        String splitArray[] = s.split("/"); //создали массив из стрк, разбитых по разделителю (",")
        double numArr[] = new double[splitArray.length]; // массив для интов
        return splitArray[1];
    }

    public static String getRatePrivatBank () throws InterruptedException {
        driver.get("https://www.privat24.ua");
        Thread.sleep(1000);
        String page = driver.getPageSource();
        StringBuilder rate = new StringBuilder();
        rate.append(page);
        int a1 = rate.indexOf("<div class=\"section-content rate\">");
        rate.delete(0,a1);
        int a2 = rate.indexOf("</div>");
        rate.delete(a2,rate.length());
        int a3 = rate.indexOf(">");
        rate.delete(0,(a3+1));

        //String s1 = deleteSpacesInString(rate.toString());
        return rate.toString();
    }

    public static String deleteSpacesInString(String s) {
        StringBuilder strBld = new StringBuilder();
        strBld.append(s);
        do {
            int a = strBld.indexOf(" ");
            strBld.deleteCharAt(a);
        } while (strBld.indexOf(" ") != -1);
        return strBld.toString();
    }
}
