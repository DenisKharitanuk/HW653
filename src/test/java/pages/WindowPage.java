package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowPage extends BasePage {
    private final static String pagePath = "/windows";

    private By clickHereButtonLocator = By.xpath("//a[@href=\"/windows/new\"]");
    private String originalWindow;

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getClickHereButtonLocator() {
        return waitsService.waitForVisibilityLocatedBy(clickHereButtonLocator);
    }

    public String getOriginalWindow() {
        return originalWindow;
    }

    public void setOriginalWindow(String originalWindow) {
        this.originalWindow = originalWindow;
    }
}
