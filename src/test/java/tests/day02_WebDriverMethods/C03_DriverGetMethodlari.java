package tests.day02_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);

        System.out.println(driver.getTitle());//sayfanın baslıgını getirir

        // sayfa baslgının Wise icerdigini test edin

        String expectedIcerik="Wise";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){

            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title Wise icermiyor, Test FAILED");
        }
        // Url'in "https://wisequarter.com" oldugunu test edelim
        String expectedUrl ="https://www.wisequarter.com";
        String actualUrl =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("url tesi FAILED");
            System.out.println("Actaul Url :"+actualUrl);
        }
        //System.out.println(driver.getPageSource());
        // sayfa kaynagı testlerde cok kullanılmaz

        System.out.println(driver.getWindowHandle());//631EFECCB79F6BBDE25748A740992196
        // Her olusturulan browser icin unique bir window handle degeri atanır
        // bu handle degeri sayfalar arasında gecis yapmak icin kullanılır
        // bu window acıkken biz baska windowda calısyorsak ve biz bu windowa gecmek istersek
        //drivera handle degeri 631EFECCB79F6BBDE25748A740992196 bu olan sayfaya git
        //dersek driver bu windowa  gecer

        System.out.println(driver.getWindowHandles());//[95BE81BA9974058C0577486D4AD80887]
        // bulundugumuz classatki driver tarafından olusturulan
        // ve acık olan tum windowların handle degerlerini  set olarak dondurur

        driver.close();



    }
}
