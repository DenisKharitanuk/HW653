package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowStep extends BaseStep {

    public WindowStep(WebDriver driver) {
        super(driver);
    }

    public void openWindowPage() {
        windowPage.openPageByUrl();
    }

    public String openNewWindows() {
        openWindowPage();
        windowPage.getClickHereButtonLocator().click();
        windowPage.setOriginalWindow(driver.getWindowHandle());
        Set<String> windowHandlesSet = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandlesSet);
        driver.switchTo().window(windowHandlesList.get(1));
        return newWindowPage.getPageMessageTextLocator().getText();
    }

    public WebElement closeNewTabAndSwitchToOldTab() {
        driver.close();
        driver.switchTo().window(windowPage.getOriginalWindow());
        return windowPage.getClickHereButtonLocator();
    }
}
