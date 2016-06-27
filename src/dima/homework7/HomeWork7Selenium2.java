package dima.homework7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 * Created by dmitriy on 26.06.16.
 * Написать программу которая
 * Сравнивает рейтинг фильмов Топ 250 c сайта imdb с рейтингом таких же фильмов на Кинопоиске.
 * (пример. Сравинить рейтинг фильма Avatar: на imdb оценка 9, на kinopoisk оценка 8.7).
 * Вывести в консоль весь список фильмов в отсортированном виде по названию(алфавиту).
 *
 */
public class HomeWork7Selenium2 {

    public static int max = 2;
    public static WebDriver driver = new ChromeDriver();

    public static ArrayList movieNamesListImdb = new ArrayList();
    public static ArrayList movieYearsListImdb = new ArrayList();
    public static ArrayList movieRatesListImdb = new ArrayList();
    public static ArrayList movieIndexListImdb = new ArrayList();
    public static ArrayList movieFulRateImdb =new ArrayList();

    public static ArrayList movieNamesListKino = new ArrayList();
    public static ArrayList movieYearsListKino = new ArrayList();
    public static ArrayList movieRatesListKino = new ArrayList();
    public static ArrayList movieIndexListKino = new ArrayList();
    public static ArrayList movieFulRateKino =new ArrayList();

    public static ArrayList combineList =new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        getImdb();
        getIMDBtop250List();
        System.out.println("-------------");
        getKinopoisk();
        getKinopoisk250List();
        System.out.println("-------------");
        doCompare();


        for (int i=0; i<combineList.size();i++){
            System.out.println(combineList.get(i));
        }

        driver.close();
    }

    public static void doCompare (){
        StringBuffer strb;
        System.out.println("do compare");

        for (int i = 0; i<max; i++){
            System.out.println("cikle i: " +i);
            String s1 = deleteSpaces(movieNamesListImdb.get(i).toString());
           // String subs1 = s1.substring(11,s1.length());

            System.out.println(s1);

            for (int j = 0; j<max; j++){
                System.out.println("cikle j: "+j);
                String s2 = deleteSpaces(movieNamesListKino.get(j).toString());
             //   String subs2 = s2.substring(11,s2.length());
                System.out.println(s2);

                if (s1.equals(s2))
                {
                    strb = new StringBuffer();
                    System.out.println("if");
                    strb.append(movieNamesListImdb.get(i));
                    strb.append(" IMDB rate: ");
                    strb.append(movieRatesListImdb.get(i));
                    strb.append(" Kinopoisk rate: ");
                    strb.append(movieRatesListKino.get(j));
                    System.out.println(strb.toString());

                    combineList.add(i,strb.toString());
                } else System.out.println(i+j);
            }
        }
    }

    public static String deleteSpaces(String string) {
        StringBuilder strBld = new StringBuilder();
        strBld.append(string);
        do {
            int a = strBld.indexOf(" ");
            strBld.deleteCharAt(a);
        } while (strBld.indexOf(" ") != -1);
        return strBld.toString();
    }

    public static void getKinopoisk250List(){
        for (int i=0; i<max; i++) {

            WebElement movie = driver.findElement(By.xpath(".//*[@id=\'top250_place_"+(i+1)+"\']/td[2]/a"));
            String fullnameOfMovie = movie.getText();
            String nameOfMovie = fullnameOfMovie.substring(0, (fullnameOfMovie.length()-7));
            movieNamesListKino.add(i, nameOfMovie);

            String yearOfMovieStr = fullnameOfMovie.substring((fullnameOfMovie.length()-5), (fullnameOfMovie.length()-1));
            double yearOfMovieD = new Double(yearOfMovieStr);
            int yearOfMovie = (int) yearOfMovieD;
            movieYearsListKino.add(i, yearOfMovie);

            WebElement rate = driver.findElement(By.xpath(".//*[@id=\'top250_place_" + (i + 1) + "\']/td[3]/div/a"));
            String rateOfMovieStr = rate.getText();
            //String rateOfMovieStdDot = rateOfMovieStr.replace(',', '.');
            double lolbRateOfMovie = new Double(rateOfMovieStr);
            // чтобы сравнивать с IMDB надо округлить
            double rateOfMovie = new BigDecimal(lolbRateOfMovie).setScale(1, RoundingMode.UP).doubleValue();
            movieRatesListKino.add(i, rateOfMovie);

            movieIndexListKino.add(i, i);

            String s = ((i + 1) + "|" + movieYearsListKino.get(i) + "|" + movieRatesListKino.get(i) + "|" + "\"" + movieNamesListKino.get(i) + "\"");
            movieFulRateKino.add(i, s);

            //System.out.println(s);
            System.out.println(movieFulRateKino.get(i));
        }
    }

    public static void getIMDBtop250List(){
        for (int i=0; i<max; i++){
            WebElement movie = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[2]/a"));
            String nameOfMovie = movie.getText();
            movieNamesListImdb.add(i,nameOfMovie);

            WebElement year = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[2]/span"));
            String yearOfMovieStr = year.getText().substring(1,5);
            double yearOfMovieD = new Double(yearOfMovieStr);
            int yearOfMovie = (int) yearOfMovieD;
            movieYearsListImdb.add(i,yearOfMovie);

            WebElement rate = driver.findElement(By.xpath(".//*[@id='main']/div/span/div/div/div[2]/table/tbody/tr["+(i+1)+"]/td[3]/strong"));
            String rateOfMovieStr = rate.getText();
            String rateOfMovieStdDot = rateOfMovieStr.replace(',','.');
            double rateOfMovie = new Double(rateOfMovieStdDot);
            movieRatesListImdb.add(i,rateOfMovie);

            movieIndexListImdb.add(i,i);

            String s = ((i+1)+"|"+movieYearsListImdb.get(i)+"|"+movieRatesListImdb.get(i)+"|"+"\""+movieNamesListImdb.get(i)+"\"");
            movieFulRateImdb.add(i, s);

            //System.out.println(s);
            System.out.println(movieFulRateImdb.get(i));
        }
    }

    public static void getImdb () throws InterruptedException {
        driver.get("http://www.imdb.com/chart/top?ref_=nv_mv_250_6");
        Thread.sleep(2000);
    }

    public static void getKinopoisk () throws InterruptedException {
        driver.get("http://www.kinopoisk.ru/top/");
        Thread.sleep(2000);
    }

}
