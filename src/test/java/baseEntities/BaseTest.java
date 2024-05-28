package baseEntities;

import configuration.ReadProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.JavaScriptAlertsPage;
import pages.NewWindowPage;
import pages.WindowPage;
import services.BrowsersService;
import steps.*;

public class BaseTest {
    protected WebDriver driver;
    protected FramesStep frame;
    protected IFrameStep iFrame;
    protected WindowStep window;
    protected NewWindowStep newWindow;
    protected JavaScriptAlertStep javaScriptAlerts;

    @BeforeEach
    public void setup() {
        driver = new BrowsersService().getDriver();

        frame = new FramesStep(driver);
        iFrame = new IFrameStep(driver);
        window = new WindowStep(driver);
        newWindow = new NewWindowStep(driver);
        javaScriptAlerts = new JavaScriptAlertStep(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
