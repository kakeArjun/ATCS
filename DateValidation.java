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
public class DateCaluculationTest {
    private WebDriver driver;
    private Map < String, Object > vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
       System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); driver=new ChromeDriver();       js = (JavascriptExecutor) driver;
        vars = new HashMap < String, Object > ();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void dateCaluculation() {
        driver.get("https://www.timeanddate.com/date/durationresult.html?d1=28&m1=01&y1=2021&d2=20&m2=02&y2=2021&ti=on");
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.findElement(By.id("d1")).click();
        driver.findElement(By.id("d1")).click(); {
            WebElement element = driver.findElement(By.id("d1"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("d1")).sendKeys("29");
        driver.findElement(By.id("m1")).click();
        driver.findElement(By.id("m1")).sendKeys("01");
        driver.findElement(By.id("y1")).click();
        driver.findElement(By.linkText("2021")).click();
        driver.findElement(By.id("y1")).sendKeys("2021"); {
            WebElement element = driver.findElement(By.cssSelector(".five:nth-child(3) .bigger"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("d2")).click();
        driver.findElement(By.id("d2")).click(); {
            WebElement element = driver.findElement(By.id("d2"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("d2")).click();
        driver.findElement(By.id("d2")).click();
        driver.findElement(By.id("d2")).click(); {
            WebElement element = driver.findElement(By.id("d2"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("m2")).click();
        driver.findElement(By.id("m2")).click(); {
            WebElement element = driver.findElement(By.id("m2"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("m2")).sendKeys("02");
        driver.findElement(By.id("y2")).click();
        driver.findElement(By.id("y2")).click(); {
            WebElement element = driver.findElement(By.id("y2"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("y2")).click();
        driver.findElement(By.cssSelector(".form_footer")).click();
        driver.findElement(By.id("ti")).click();
        driver.findElement(By.id("ti")).click();
        driver.findElement(By.id("subbut2")).click(); {
            WebElement element = driver.findElement(By.cssSelector(".btn-datepicker:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
    }
}