package Pom;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DocumentsPage {
   private WebDriver driver;
    By filename = new By.ByXPath("//span[contains(text(), '$44')]");
    public DocumentsPage(WebDriver driver){

        this.driver=driver;
    }
    public String checkPrices(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = driver.findElement(filename);
        wait.until(ExpectedConditions.visibilityOf((element)));
        String docName = element.getText();
        return docName;
    }
}