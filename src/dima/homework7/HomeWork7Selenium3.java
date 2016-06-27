package dima.homework7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by dmitriy.k on 27.06.16.
 */
public class HomeWork7Selenium3 {

    public static WebDriver  driver = new ChromeDriver();



    @Test
    public static void facebook (){

    }

    public static void facebookLogin () throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("id('email')")).click();

    }

}
