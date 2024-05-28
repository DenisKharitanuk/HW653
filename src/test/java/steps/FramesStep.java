package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.IFramePage;

public class FramesStep extends BaseStep {
    public FramesStep(WebDriver driver) {
        super(driver);
    }

    public void openFramePage(){
        framesPage.openPageByUrl();
    }
    public IFramePage openIFramePage(){
        openFramePage();
        framesPage.getIFrameLocator().click();
        return iFramesPage;
    }


}
