package Base;

import Pom.DocumentsPage;
import Pom.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseSetUp {
  private WebDriver driver;
   protected HomePage homePage ;
    String url="https://www.levelset.com/";
   @BeforeClass
    public void setUp(){
       driver = new ChromeDriver();
       driver.get(url);
       homePage = new HomePage(driver);
   }
   /* @AfterClass
    public void quit(){
       driver.quit();
    }*/

}
