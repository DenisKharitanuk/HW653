package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramePage extends BasePage {
    private final static String pagePath = "/iframe";
    private By boldButtonLocator = By.xpath("//button[@aria-label='Bold']");
    private By iFrameLocator = By.xpath("//IFrame");
    private By tinymceLocator= By.id("tinymce");

    public IFramePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getBoldButtonLocator(){
        return waitsService.waitForClickable(boldButtonLocator);
    }

    public WebElement getStartInputTextLocator(){
        return waitsService.waitForClickable(iFrameLocator);
    }
    public WebElement getTinymceLocator(){
        return waitsService.waitForClickable(tinymceLocator);
    }
}
