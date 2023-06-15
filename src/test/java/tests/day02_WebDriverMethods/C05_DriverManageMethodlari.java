package tests.day02_WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        implicitlyWait Seleniumdan gelen Dinamik bir beklemedir.
        Sayfanın yuklenmesi veya islem yapılacak web elementlerin bulunmsdi icin beklenecek
        maximum sureyi belirler
        Driver bu sure dolana kadar verilen gorevin yapılıp yapılmadıgını kontrol eder
        bu sure icerisinde gorev yapılamazsa Exeption firlatip calismayi durdurur
         */

        driver.get("https://www.wisequarter.com");
        System.out.println("Baslangıc konumu"+driver.manage().window().getPosition());
        System.out.println("Baslangıc size"+driver.manage().window().getSize());


        driver.manage().window().setSize(new Dimension(1200,500));
        driver.manage().window().setPosition(new Point(100,200));

        System.out.println("Degisen yeni konumu"+driver.manage().window().getPosition());
        System.out.println("Degisen yeni size"+driver.manage().window().getSize());



        Thread.sleep(3000);
        //Javadan gelir ve yazdımız sure miktarınca kodları bekletir.
        driver.close();
    }
}
