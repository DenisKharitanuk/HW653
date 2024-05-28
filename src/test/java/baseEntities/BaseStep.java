package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;

    protected FramesPage framesPage;
    protected IFramePage iFramesPage;
    protected JavaScriptAlertsPage javaScriptAlertsPage;
    protected NewWindowPage newWindowPage;
    protected WindowPage windowPage;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        framesPage = new FramesPage(driver);
        iFramesPage = new IFramePage(driver);
        javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
        newWindowPage = new NewWindowPage(driver);
        windowPage = new WindowPage(driver);
    }
}
