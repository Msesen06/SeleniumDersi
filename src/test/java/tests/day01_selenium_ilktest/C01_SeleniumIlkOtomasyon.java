package tests.day01_selenium_ilktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_SeleniumIlkOtomasyon {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");


        /*
        Selenium ile testleri calıstırırken iyi bir orkestra yoneticisi olmalısınız
        hangi enstrumanı ne icin kullanacgınız ve hangi asamada hangi enstrumanı
        projenize dahil edeceginizi bilmeniz gerekir

        1- Programlama dili (Java)
        2- IDE (IntelliJ)
        3- Selenium Kutuphanesi
            Bunun icin selenium sitesinden kullandıgımız bilgisayara uygun
            jar dosyalarını indirip projemizin icerisine kopyaladik
            bu jar dosyalarını projemize eklemek icin
            File/Project Structure /Modulus menusunden DEpendencies tabini secip
            + tusuna basarak Selenium klasorundeki tum jar dosylarını projeye ekledik
         4- WEb driver
            Herkesin pc nin isletim sistemi ve chrome surumu farklı oldugu icin
            o surumu ogrenip indiriyoruz ve projeye ekleriz
         */
    }
}
