package tests.day03_WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
            //panel-heading

        List<WebElement> categoryElemenleriList =driver.findElements(By.className("panel-heading"));
        int expectedKategoriSayisi=3;
        int actualKategoriSayisi =categoryElemenleriList.size();
        //4- Category bolumunde 3 element oldugunu test edin

        if (expectedKategoriSayisi==actualKategoriSayisi){
            System.out.println("kategori sayısı testi PASSED");
        }else {
            System.out.println("kategori sayısı testi FAILED");
        }
        //5- Category isimlerini yazdirin
         /*
            Bir listeyi direkt yazdırabiliriz
            ancak webelement oldugu icin referans degeri yazdırır
            her bir web elementi alıp onun uzerindeki texti yzdırmak icin
            for each loop kullanmalıyız
         */
        for (WebElement eachElement:categoryElemenleriList
             ) {
            System.out.println(eachElement.getText());
        }
        //6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();

    }
}
