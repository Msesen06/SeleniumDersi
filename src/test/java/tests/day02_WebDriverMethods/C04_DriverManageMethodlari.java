package tests.day02_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("wbdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.wisequarter.com");
        // urlde www olma sa calısır.  ancak https olmadan calısmaz

        System.out.println("İlk sayfa size :"+driver.manage().window().getSize());
        System.out.println("İlk sayfanın konumu"+driver.manage().window().getPosition());

        driver.manage().window().maximize();
        System.out.println("Maximize size degeri :"+driver.manage().window().getSize());
        System.out.println("maximize sayfa konumu"+driver.manage().window().getPosition());
        Thread.sleep(2000);


        driver.manage().window().fullscreen();
        System.out.println("Fullscreen size degeri :"+driver.manage().window().getSize());
        System.out.println("Fullscreen sayfa konumu"+driver.manage().window().getPosition());

        Thread.sleep(3000);
        driver.close();


    }
}
