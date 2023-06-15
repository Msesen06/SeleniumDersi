package tests.day02_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverOlusturma {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");

        // bu classa kullanılacak Webdriveri ve
        // bu driver ile ilgili dosyaları nerede bulabilecegimizi tanımlar

        WebDriver driver =new ChromeDriver();
        // driver objesi olusturur,
        // bu obje bizim icin istedigimiz wweb sayfasına gidebilecek
        // o sayfalarda istedigimiz islemi yapabilecek ozelliklerdedir.
        // Web sayfalarına gidebilmek ve islemler yapabilmek icin browsera ihtiyac oldugundan
        //driver objesi SetProperty ile tanımladıgımız browserin bir kopyasını olusturur
        // ve kopya browser ile tum islemleri yapar.

        // Selenium 4.7 versiyonu ile kendi browserini olusturdu
        // yani biz chromedriver.exe dosyasını indirmemiş olsak bile 8.satırı yazmasak da kendi driverini olsuturur


     /*
    Selenium'u projemize dahil edebilmek icin
    normalde maven altyapisini kullaniriz
    Ancak, maven sart degildir.
    Bir framework'e Selenium dosyalarini eklerseniz
    Selenium kutuphanelerini kullanabilirsiniz.

    Bir projeye Selenium eklemenin en ILKEL yolu
    File/ProjectStructure/Modules/Dependencies
    sekmelerini secip, Selenium jar dosyalarini manuel olarak projeye eklemektir

    Ancak bu yontem tek basina yeterli degildir
    Selenium yaninda kullanacagimiz WebDriver'i da projemize eklememiz gerekir.

    Her bilgisayarda kullanilan browser
    ve o browser'in versiyonu farkli olacagindan
    bu yontemi kullandigimizda her class'da
    kullanilacak driver'i sisteme tanitmamiz gerekir

    */
    }
}
