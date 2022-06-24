import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrendyolTest {
    @Test
    public void LoginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asaid\\Desktop\\seleniumweb\\src\\main\\resources\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        //It connects to trendyol.com
        driver.get("https://www.trendyol.com/giris");

        System.out.println(driver.getCurrentUrl());

        //Sign in page, enter the user name and password and clicks on loginbuton
        driver.findElement(By.id("login-email")).sendKeys("a.saidenes@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("login-password-input")).sendKeys(".enessaid2701");
        Thread.sleep(2000);
        driver.findElement(By.id("login-password-input")).sendKeys(Keys.ENTER);
        int i = driver.findElements(By.id("account-navigation-container")).size();
        Assert.assertEquals(true, i > 0);
    }

    @Test
    public void addToBasket() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asaid\\Desktop\\seleniumweb\\src\\main\\resources\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        //It connects to trendyol.com
        driver.get("https://www.trendyol.com/");

        System.out.println(driver.getCurrentUrl());

        driver.get("https://www.trendyol.com/netflix/75-tl-netflix-hediye-karti-p-47214606");
        driver.findElement(By.className("add-to-basket")).sendKeys(Keys.ENTER);
        int a = driver.findElements(By.className("add-to-basket")).size();
        Assert.assertEquals(true, a > 0);

    }
}
