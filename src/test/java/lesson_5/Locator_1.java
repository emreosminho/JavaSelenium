package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://www.amazon.com.tr/ git
        driver.get("https://www.amazon.com.tr/");

        // Çerezleri kabul et
        driver.findElement(By.id(    "sp-cc-accept")).click();

        // Arama butonuna iphone 11 yaz ve arama  işlemini yap
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // arama sonucu iphone 11 içeriyor mu kontrol et
        String sonuc = driver.findElement(By.xpath("(//div[@class=\"sg-col-inner\"]/h2/span)[3]")).getText();
        if (sonuc.contains("iphone 11")){
            System.out.println("Arama Sonucu Doğrudur...");
        } else {
            System.out.println("Arama sonucu yanlış tekrar deneyiniz...");
        }

        // İlk ürünün fiyatını console yazdır
        System.out.println("İlk Ürün Fiyatı: " + driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText());

        // 2 sn bekle browser kapat
        Thread.sleep(2000);
        driver.close();

    }
}
