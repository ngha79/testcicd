package vn.poly.nguyenmanhha_ph61371;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.vietjetair.com/vi/ve-may-bay/bay-dang-cap-boss-gia-chi-eco-uu-dai-20-ngay-20-hang-thang/?utm_source=google-vj-sg&utm_medium=cpc&utm_campaign=pmax_singaporesunbird2025_ci_perfmax_0125intflt-sale20_promo-destn-sgp-skyboss-kv_sgpawo2024_cpa_ob");
        Thread.sleep(2000);

        driver.findElement(By.id("tripType2")).click();
        driver.findElement(By.id("input-departure")).sendKeys("Tp. Hồ Chí Minh");
        driver.findElement(By.id("departureDate")).sendKeys("18/03/2026");
        driver.findElement(By.id("input-departure-2")).sendKeys("Hà Nội");
        driver.findElement(By.id("input-passenger-mb")).sendKeys("1 người lớn");
        driver.findElement(By.id("ldr_promoCode")).sendKeys("123");
        driver.findElement(By.id("flexCheckDefault")).click();


        driver.findElement(By.className("search_flights")).click();
        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("select-flight?itm_source"));

        System.out.println("Tìm kiếm vé máy bay thành công");

        Thread.sleep(3000);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}