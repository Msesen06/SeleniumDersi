package tests.day03_WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonAramaTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazona anasayfasına gidin
        driver.get("https://www.amazon.com");
        // Arama cubuguna Nutella yazdırıp aratın
            /*
            Bir web elementi kullanabilmek icin oncelikle o web elementi driverin bulabilmesi icin
            Locate etmeliyiz,
            amazon arama cubugu icin bu bilginin id=twotabsearchtextbox oldugunu
            amazon sayfasında arastırma yaparak bulduk
            Sonra bu Locate bilgisini kullanarak web sayfasında o elementi bulup
             bu classta o web elementi kullabilmek icin
            kaydedecek bir hazır methoda ihtiyac var
             */

        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        /*
            Bu satırda 3 işlem yapılıyor
            1- Locate islemi : id=twotabsearchtextbox
            2- bu locate i kullanarak istedigimiz arama kutusunu bize getirecek method
            driver.findElement(By.id
            3-locate edip findElement ile buldugumuz web elementi icinde bulundugumuz
            classta kullanabilmek icin bir webelement objesine atamak
         */
        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();
        // Arama sonuclarının Nutella icerdigini test edin
        WebElement aramaSonuclariElementi = driver.findElement(By.className("sg-col-inner"));
        // Aramasonucelementi bir web elmentidir
        // primtive data turu olmadıgından direkt yazdırmak istersek referansını yazdırır

        System.out.println(aramaSonuclariElementi.getText());

        String expectedIcerik ="Nutella";
        String actualSonucYazisi =aramaSonuclariElementi.getText();

        if (actualSonucYazisi.contains(expectedIcerik)){

            System.out.println("nutella arama testi PASSED");
        }else {
            System.out.println("nutella arama testi FAILED arama sonucu\n :"+actualSonucYazisi);
        }
        Thread.sleep(5000);
        driver.close();
    }
}
