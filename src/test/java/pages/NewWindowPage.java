package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewWindowPage extends BasePage {

    private final static String pagePath = "/windows/new";
    private By pageMessageTextLocator = By.xpath("//div/h3");

    public NewWindowPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getPageMessageTextLocator() {
        return waitsService.waitForExists(pageMessageTextLocator);
    }
}
