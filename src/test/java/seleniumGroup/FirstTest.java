package seleniumGroup;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
  private WebDriver driver;
  private String baseUrl;

  @BeforeClass()
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://localhost";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void firstTest() throws Exception {
    driver.get(baseUrl + "/php4dvd-2.0-patched/php4dvd/");
    By userName = By.id("username");
	driver.findElement(userName).clear();
    driver.findElement(userName).sendKeys("admin");
    WebElement userPassword = driver.findElement(By.name("password"));
	userPassword.clear();
    userPassword.sendKeys("admin");
    driver.findElement(By.name("submit")).click();
  }

  @AfterClass()
  public void tearDown() throws Exception {
    driver.quit();
  }

 
}
