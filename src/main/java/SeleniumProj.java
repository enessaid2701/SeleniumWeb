import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumProj {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asaid\\Desktop\\seleniumweb\\src\\main\\resources\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("xxxx");
        driver.findElement(By.id("pass")).sendKeys("xxxx");
        driver.findElement(By.name("login")).click();

        if(!driver.getCurrentUrl().equals("https://www.facebook.com/login.php?login_attempt=1")){
            connectN11();
        }
    }
    /**
     * In n11.com transactions
     */
    private static void connectN11() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //It connects to n11.com
        driver.get("https://www.trendyol.com/giris");

        System.out.println(driver.getCurrentUrl());

        //Sign in page, enter the user name and password and clicks on loginbuton
        driver.findElement(By.id("login-email")).sendKeys("a.saidenes@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("login-password-input")).sendKeys(".enessaid2701");
        Thread.sleep(2000);
        driver.findElement(By.id("login-password-input")).sendKeys(Keys.ENTER);
        //driver.findElement(By.id("loginButton")).submit();

        //System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        
        driver.get("https://www.trendyol.com/muya/taurus-anatomik-erkek-sandalet-p-105133036");
        //Search button is clicked
        driver.findElement(By.className("add-to-basket")).click();

        System.out.println(driver.getCurrentUrl());
    }
}
