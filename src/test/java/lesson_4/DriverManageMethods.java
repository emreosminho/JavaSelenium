package lesson_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Youtube sayfasına gidelim
        driver.get("https://www.youtube.com/");
        // 2. Sayfanın konumunu ve boyutlarını yazdıralım.
        System.out.println("Sayfanın Konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());
        //  3. Sayfayı simge durumuna getir
        driver.manage().window().minimize();
        // 4. Simge durumunda 3 saniye bekle tekrar maximize et
        Thread.sleep(3000);
        driver.manage().window().maximize();
        // 5. Sayfanın durumunu maximize durumda yazdır
        System.out.println("2. Durum Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("2. Durum Sayfanın boyutları: " + driver.manage().window().getSize());
    }
}
