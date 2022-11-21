package lekcijaDevini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
   public WebDriver driver;
   public WebDriverWait wait;




    @BeforeMethod
    public void setupBrowser(){
        driver = new ChromeDriver();
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.barbora.lv/");


    }
    @AfterMethod
    public void tearDownBrowser(){
        driver.quit();
    }
}
