package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage extends BasePage {

    private final static String pagePath = "/frames";

    private By iFrameLocator = By.xpath("//a[@href='/iframe']");

    public FramesPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getIFrameLocator(){
        return waitsService.waitForExists(iFrameLocator);
    }
}
