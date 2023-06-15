package tests.day02_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_SeleniumDriveriOtomatikKullanma {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new EdgeDriver();
        //driver objesi olusturdugumuzda
        //Selenium istedgimiz browserin bir kopyasını olusturur ve kapatmadıkca acık kalır.


        // Kodlar cok hızlı calıstıgı icin bazı asmaları gozle gorebilmek veya internetteki yavaslıktan dolayı
        //testin failed olmaması icin
        //Thread.sleep() ile kodları istedigimiz sure kadar durdurabiliriz.

        Thread.sleep(2000);

        driver.get("https://www.amazon.com.tr");
        // get(url) olusturdugumuz kopya browser ile istenen web sayfasına gider
        Thread.sleep(2000);
        driver.close();
    }
}
