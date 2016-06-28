package dima.homework7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Написать тест который проверяет переключение языков на Facebook
 * (Главная страница без авторизации). (15 любых языков)
 */
public class HomeWork7Selenium3 {

    public static WebDriver  driver = new ChromeDriver();




    @Test
    public static void ukrLangTest () throws InterruptedException {


        System.out.println(driver.getTitle());
        System.out.println("---");
        //driver.findElement(By.xpath(".//*[@id=\'pageFooter\']/ul/li[12]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/ul/li[2]/a")).click();

        String str1 = driver.getTitle().toString();

        String str1orig = "Ласкаво просимо до Facebook - заходьте, реєструйтеся та дізнавайтеся!";
        if (str1.equals(str1orig)){
            System.out.println("pass");
        } else System.out.println("fail");
    }

    @Test
    public static void rusLangTest () throws InterruptedException {

//      driver.findElement(By.xpath(".//*[@id=\'pageFooter\']/ul/li[12]/a")).click();
        driver.findElement(By.xpath("html/body/div/div[2]/div[2]/ul/li[2]/a")).click();

        String str1 = driver.getTitle().toString();

        String str1orig = "Добро пожаловать на Фейсбук - заходите, регистрируйтесь и находите друзей.";
        if (str1.equals(str1orig)){
            System.out.println("pass");
        } else System.out.println("fail");
    }

    @AfterTest
    public static void closeBrowser(){
        driver.close();
    }

    @BeforeTest
    public static void getFacebook () throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);



    }

}
