import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EKARTTest {
    private WebDriver driver;
    private Map < String, Object > vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
         System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
          driver=new ChromeDriver();  
      js = (JavascriptExecutor) driver;
        vars = new HashMap < String, Object > ();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void eKART() {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.findElement(By.cssSelector(".product:nth-child(2) .quantity")).click();
        driver.findElement(By.cssSelector(".product:nth-child(2) .quantity")).sendKeys("2");
        driver.findElement(By.cssSelector(".product:nth-child(2) button")).click();
        driver.findElement(By.cssSelector(".product:nth-child(3) .quantity")).click();
        driver.findElement(By.cssSelector(".product:nth-child(3) .quantity")).sendKeys("3");
        driver.findElement(By.cssSelector(".product:nth-child(3) button")).click();
        driver.findElement(By.cssSelector(".product:nth-child(15) .quantity")).click();
        driver.findElement(By.cssSelector(".product:nth-child(15) .quantity")).sendKeys("5");
        driver.findElement(By.cssSelector(".product:nth-child(15) button")).click();
        driver.findElement(By.cssSelector(".cart-icon > img")).click();
        driver.findElement(By.cssSelector(".action-block:nth-child(2) > button")).click();
        driver.findElement(By.cssSelector(".promoCode")).click();
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("ATCS");
        driver.findElement(By.cssSelector(".promoBtn")).click();
    }
}