package tests.day03_WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_Locators {
    public static void main(String[] args) throws InterruptedException {

         /*
        Locator : verdigimiz locate bilgisini kullnarak driverin locate etmesini saglayan hazır
                methodlardır.

        Seleniumda 8 adet locator vardır.
            -ilk 6 tanesi web elementi olusturan html kodun icerigine baglıdır.
                1-By.id
                2- By.name
                3-By.classname
                4-By.linktext
                5-By.partialLinkText
                6-By.tagName
             - son iki tanesi ie her turlu web element icin kullanılır
                By.Xpath ve By.cssSelector



         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon anasyafsına gidelim

        driver.get("https://www.amazon.com");
        //WebElement aramaKutusuElementi = driver.findElement(By.id("Twotabsearchtextbox"));
        WebElement aramaKutusuElementi = driver.findElement(By.name("field-keywords"));
        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();

        // gosterilen urun resimlerinin 10dan fazla oldugunu test edin
        //Locater stratejisi By.classname secildiginde class valuesu space iceriyorsa
        //Locate islemi hata verebilir
        List<WebElement> urunIsimElementleriList =
        driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        if (urunIsimElementleriList.size()>10){
            System.out.println("Listelenen urun sayısı testi PASSED");
        } else {
            System.out.println("Listelenen urun sayısı testi FAILED");
        }

        //5.urun ismini yazdırın isminin nutella icerdigini test edin
        String besinciUrunSImi =urunIsimElementleriList.get(4).getText();
        System.out.println(besinciUrunSImi);
        String expectedIcerik ="Nutella";
        if (besinciUrunSImi.contains(expectedIcerik)){
            System.out.println("besinci urun ismi tesi PASSED");
        }else {
            System.out.println("besinci urun ismi tesi FAILED");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
