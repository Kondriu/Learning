package myClases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dmitriy on 20.06.16.
 */
public class vkBot {
    public static WebDriver driver = new ChromeDriver();

    public static void loginDima (){
        driver.get("http://vk.com/"); //
        driver.findElement(By.xpath(".//*[@id='quick_email']")).sendKeys("dmitriy.vladimirovich@gmail.com");
        driver.findElement(By.xpath(".//*[@id='quick_pass']")).sendKeys("Ltkmaf");
        driver.findElement(By.xpath(".//*[@id='quick_login_button']")).click();
    }

    public static void loginKilgor (){
        driver.get("http://vk.com/"); //
        driver.findElement(By.xpath(".//*[@id='quick_email']")).sendKeys("+380965547047");
        driver.findElement(By.xpath(".//*[@id='quick_pass']")).sendKeys("qazxsw1234");
        driver.findElement(By.xpath(".//*[@id='quick_login_button']")).click();
    }

}
