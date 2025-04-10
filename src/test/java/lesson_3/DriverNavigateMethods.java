package lesson_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Amazon sayfasına gidelim
        driver.navigate().to("https://www.amazon.com.tr/");
        // 2. Youtube sayfasına gidelim
        driver.navigate().to("https://www.youtube.com/");
        // 3. Tekrar Amazon sayfasına dönelim
        driver.navigate().back();
        // 4. Yeniden Youtube sayfasına gidelim
        driver.navigate().forward();
        Thread.sleep(2000);
        // 5. Sayfayı refresh edelim
        driver.navigate().refresh();

        driver.close();
    }

}
