package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Util {//Hooks is sub class of Util class

    BrowserManager browserManager = new BrowserManager(); //Crate Object Of BrowserManager.

    @Before//Before run All Feature file.
    public void openBrowser() {
        browserManager.setUpBrowser();//call Method of BrowserManager class
    }

    @After//After run All Feature file.
    public void closeBrowser(Scenario scenario)//when scenario fail then click screen shot .
    {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        }
        browserManager.closeBrowser();//call Method of BrowserManager class
    }


}
