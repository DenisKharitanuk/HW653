package tests;

import baseEntities.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HerokuappTest extends BaseTest {

    String text = "Hello World";

    @Test
    public void iFrameTest() {
        // Тест сделан "в слепую" - т.к. пользоваться редактором не могу.
        // (TinyMCE is in read-only mode because you have no more editor loads available this month.
        // Please request that the admin upgrade your plan
        //or add a valid payment method for additional editor load charges.)

        frame.openIFramePage();
        iFrame.inputBoldText(text);
    }

    @Test
    public void windowsTest() {
        assertEquals(window.openNewWindows(), "New Window");
        assertTrue(window.closeNewTabAndSwitchToOldTab().isDisplayed());
    }

    @Test
    public void infoAlertTest() {
        assertEquals(javaScriptAlerts.clickForJSAlert(), "I am a JS Alert");
        assertTrue(driver.getPageSource().contains("You successfully clicked an alert"));
    }

    @Test
    public void confirmationInfoAlertTest() {
        javaScriptAlerts.clickForConfirmationInfoAlert();
        assertTrue(driver.getPageSource().contains("You clicked: Cancel"));
    }

    @Test
    public void confirmationDeclineInfoAlertTest() {
        javaScriptAlerts.clickForPromtInfoAlert(text);
        assertTrue(driver.getPageSource().contains(text));
    }
}
