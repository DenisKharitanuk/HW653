package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertsPage extends BasePage {

    private final static String pagePath = "/javascript_alerts";

    private By clickForJSAlertButtonLocator = By.xpath("//button[@onclick='jsAlert()']");
    private By clickForJSConfirmLocator = By.xpath("//button[@onclick='jsConfirm()']");
    private By clickForJSPromptLocator = By.xpath("//button[@onclick='jsPrompt()']");


    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getClickForJSAlertButtonLocator() {
        return waitsService.waitForClickable(clickForJSAlertButtonLocator);
    }

    public WebElement getForJSConfirmButtonLocator() {
        return waitsService.waitForClickable(clickForJSConfirmLocator);
    }

    public WebElement getClickForJSPromptLocator() {
        return waitsService.waitForClickable(clickForJSPromptLocator);
    }
}
