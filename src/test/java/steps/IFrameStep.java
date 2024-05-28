package steps;

import baseEntities.BaseStep;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;

public class IFrameStep extends BaseStep {
    public IFrameStep(WebDriver driver) {
        super(driver);
    }

    public void inputBoldText(String text) {
        iFramesPage.getBoldButtonLocator().click();
        driver.switchTo().frame("mce_0_ifr");
        iFramesPage.getTinymceLocator().click();
        iFramesPage.getTinymceLocator().sendKeys(text);
        driver.switchTo().defaultContent();
    }
}
