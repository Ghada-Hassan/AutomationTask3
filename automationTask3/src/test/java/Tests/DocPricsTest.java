package Tests;

import Base.BaseSetUp;
import Pom.DocumentsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DocPricsTest extends BaseSetUp {

    @Test
    public void testSuceessfullyGetDocPrice(){
        DocumentsPage doc = homePage.clickGetPaid();
         String dd = doc.checkPrices();
        Assert.assertTrue(dd.contains("$449"));

    }

}
