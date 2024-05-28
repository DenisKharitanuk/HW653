package steps;

import baseEntities.BaseStep;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaScriptAlertStep extends BaseStep {

    Alert alert;

    public JavaScriptAlertStep(WebDriver driver) {
        super(driver);
    }

    public void openJSAlertPage() {
        javaScriptAlertsPage.openPageByUrl();
    }

    public void switchToAlert() {
        alert = driver.switchTo().alert();
    }

    public String clickForJSAlert() {
        openJSAlertPage();
        javaScriptAlertsPage.getClickForJSAlertButtonLocator().click();
        switchToAlert();
        alert.accept();
        return alert.getText();
    }

    public void clickForConfirmationInfoAlert() {
        openJSAlertPage();
        javaScriptAlertsPage.getForJSConfirmButtonLocator().click();
        switchToAlert();
        alert.dismiss();
    }

    public void clickForPromtInfoAlert(String text) {
        openJSAlertPage();
        javaScriptAlertsPage.getClickForJSPromptLocator().click();
        switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }
}
