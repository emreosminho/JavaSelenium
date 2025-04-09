package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. sayafaya git
        driver.get("https://www.amazon.com.tr/");

        // 2. sayfa title yazdır.
        System.out.println("Sayfanın title: " + driver.getTitle());
        String actualTitle = driver.getTitle();

        // 3. sayfa başlığının amazon içeriğini test et
        String expectedTitle = "Amazon";
        if (actualTitle.contains("Amazon")){
            System.out.println("Title Testi GEÇTİ...");
        } else {
            System.out.println("KALDI...");
        }

        // 4. sayfanın url'ini yazdır
        System.out.println("URL: " + driver.getCurrentUrl());
        String actualUrl = driver.getCurrentUrl();

        // 5. sayfanın url'i Amazon içeriyor mu?
        if (actualUrl.contains("amazon")){
            System.out.println("url Amazon içeriyor Geçti...");
        } else {
            System.out.println("url Amazon içermiyor Kaldı!!!");
        }

        // 6. sayfanın handle degerini yazdır
        System.out.println("Sayfanın handle degeri: " + driver.getWindowHandles());

        // 7. sayfanın HTML kodlarında 'shopping' kelimesi geçiyor mu?
        String actualSource = driver.getPageSource();
        String expectedSource = "shopping";
        if (actualSource.contains(expectedSource)){
            System.out.println("HTMLde shopping kelimesi var Geçti...");
        } else {
            System.out.println("HTMLde shopping kelimesi yok Kaldı!!!");
        }

        // 8. sayfayı kapatın
        driver.close();





    }
}
