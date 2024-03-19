package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    By getPaid = By.xpath("//*[@id=\"header\"]/div/div/div[2]/nav/ul/li[8]/a");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DocumentsPage clickGetPaid() {

        WebElement getPaidElement = driver.findElement(getPaid);
        getPaidElement.click();
        getPaidElement.click();
        return new DocumentsPage(driver);
    }


}
