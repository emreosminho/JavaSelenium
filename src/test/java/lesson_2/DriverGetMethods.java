package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); // Belirtilen url'e gider.

        System.out.println("Tarayıcıda yazan url: " + driver.getCurrentUrl()); // Tarayıcıdaki urli alır.

        System.out.println("Tarayacıdaki title: " + driver.getTitle()); // Sayfaya ait title getirir.

        driver.getPageSource(); // Sayfaya ait html kodunu getirir.

        System.out.println(driver.getWindowHandles()); //Tarayıcıda açtığımız adresin uniq değeri.

        System.out.println("Class: " + driver.getClass()); // Driver clasını getirir.



    }
}
