package dima.homework7;


import org.openqa.selenium.By;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by dmitriy on 28.06.16.
 */
public class GetLangs extends HomeWork7Selenium3{
    protected static String path = "/home/dmitriy/Рабочий стол/tt2.txt";
    public static void main(String[] args) throws InterruptedException, IOException {

        getFacebook();
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/ul/li[12]/a")).click();
        String str1 = driver.getPageSource();
        //System.out.println(str1);
        fileWrite(path,str1);


        closeBrowser();
    }

    //записать
    public static void fileWrite (String path, String addLine) throws IOException {

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(path)));

        //writer.newLine();
        writer.append(addLine);
        writer.close();
    }

}
