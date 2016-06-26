package dima.homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by root on 5/19/16.
 */
public class HomeWork4Selenium {
    public static int max = 250;
    public static ArrayList movieNamesList = new ArrayList();
    public static ArrayList movieYearsList = new ArrayList();
    public static ArrayList movieRatesList = new ArrayList();
    public static ArrayList movieIndexList = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
/*
Зайти на http://www.imdb.com/
Перейти на страницу с Top 250 фильмов
Вывести в консоль "Название фильма + оценку"
Вывести в консоль самый старый фильм (год выпуска)
Вывести в консоль самый новый фильм из этого рейтинга
*/
        WebDriver driver = new ChromeDriver();
        //driver.get("http://www.imdb.com/");
        driver.get("http://www.imdb.com/chart/top?ref_=nv_mv_250_6");
        Thread.sleep(2000);

/*        driver.findElement(By.xpath("./*//*[@id='navTitleMenu']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("./*//*[@id='navMenu1']/div[2]/ul[1]/li[6]/a")).click();
        Thread.sleep(2000);*/

        for (int i=0; i<max; i++){
            WebElement movie = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[2]/a"));
            String nameOfMovie = movie.getText();
            movieNamesList.add(i,nameOfMovie);

            WebElement year = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[2]/span"));
            String yearOfMovieStr = year.getText().substring(1,5);
            double yearOfMovieD = new Double(yearOfMovieStr);
            int yearOfMovie = (int) yearOfMovieD;
            movieYearsList.add(i,yearOfMovie);

            WebElement rate = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[3]/strong"));
            String rateOfMovieStr = rate.getText();
            String rateOfMovieStdDot = rateOfMovieStr.replace(',','.');
            double rateOfMovie = new Double(rateOfMovieStdDot);
            movieRatesList.add(i,rateOfMovie);

            movieIndexList.add(i,i);

            System.out.println((i+1)+"\t\t"+movieRatesList.get(i)+"\t\t"+"\""+movieNamesList.get(i)+"\"");
        }

        System.out.println("---");
        System.out.println("Самый старый: "+getMin()+"года");
        System.out.println("Называется - \""+movieNamesList.get(getIndexOfMin())+"\"");

        System.out.println("---");
        System.out.println("Самый новый: "+getMax()+"года");
        System.out.println("Называется - \""+movieNamesList.get(getIndexOfMax())+"\"");

        driver.close();
    }

    public static int getMin(){
        int [] arr = new int[max];
        for (int i =0; i<max; i++) {
            arr[i] = (int) movieYearsList.get(i);
        }
        Arrays.sort(arr);
        return arr[0];
    }

    public static int getMax(){
        int [] arr = new int[max];
        for (int i =0; i<max; i++) {
            arr[i] = (int) movieYearsList.get(i);
        }
        Arrays.sort(arr);
        return arr[max-1];
    }

    public static int getIndexOfMax(){
        return movieYearsList.indexOf(getMax());
    }

    public static int getIndexOfMin(){
        return movieYearsList.indexOf(getMin());
    }

}