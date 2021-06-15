package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {//BrowserManager is sub class of Util class
    //Crate Object Of LoadProp
    public static LoadProp loadProp = new LoadProp();
    //Create a variable for store String value.
    public static final String USERNAME = loadProp.getProperty("BROWSER_STACK_USERNAME");
    //Create a variable for store String value.
    public static final String ACCESS_KEY = loadProp.getProperty("BROWSER_STACK_ACCESS_KEY");
    //Create a variable for store String value And String Concatenation.
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    //Create a variable for store boolean value via System property.
    public static final boolean BROWSER_STACK = Boolean.parseBoolean(loadProp.getProperty("BrowserStack"));
    //Create a variable for store String value via system property.
    public static final String browserName = loadProp.getProperty("browserName");


    DesiredCapabilities caps = new DesiredCapabilities();


    public void setUpBrowser() {
        //If sauce lab true then start this condition and start automation in sauce lab.
        if (BROWSER_STACK) {
            //String concatenation and string value print
            System.out.println("*** Automation  Start  In  (  ***  Browser Stack ***  ) && " + "  (  ***  " + browserName + "  ***  )");
            //browser name match ( Chrome ) run this browser
            if (browserName.equalsIgnoreCase("Chrome")) {
                //sauce lab open In (Firefox) and create virtual machine for automation

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            }
            //browser name match ( Firefox ) run this browser
            else if (browserName.equalsIgnoreCase("Firefox")) {
                //sauce lab open In (Firefox) and create virtual machine for automation

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.10.0");

                //browser name match ( InternetExplorer ) run this browser
            } else if (browserName.equalsIgnoreCase("InternetExplorer")) {
                //sauce lab open In (InternetExplorer) and create virtual machine for automation

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "IE");
                caps.setCapability("browser_version", "11.0");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");

                //browser name match ( Safari ) run this browser
            } else if (browserName.equalsIgnoreCase("Safari")) {
                //sauce lab open In (Safari) and create virtual machine for automation

                caps.setCapability("os", "OS X");
                caps.setCapability("os_version", "Big Sur");
                caps.setCapability("browser", "Safari");
                caps.setCapability("browser_version", "14.0");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            }

            try {//Exception handling when remote the browser
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        } else {
            //else sauce lab false then start this condition and start automation in Local Device.
            System.out.println("***  Automation Start With ( *** Local Device *** ) && " + " ( ***  " + browserName + "  *** )");//print string value
            //if else if condition for cross browsing
            //browser name match ( Chrome ) run this browser

            if (browserName.equalsIgnoreCase("Chrome")) {
//                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--incognito");
                //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("headless");
                //options.addArguments("window-size=1200x600");
                driver = new ChromeDriver();
                //browser name match ( Firefox ) run this browser
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                FirefoxBinary firefoxBinary = new FirefoxBinary();
              //firefoxBinary.addCommandLineOptions("--headless");
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
              //FirefoxOptions firefoxOptions = new FirefoxOptions();
            //  firefoxOptions.setBinary(firefoxBinary);
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("InternetExplorer")) {
                //   DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
                // Set ACCEPT_SSL_CERTS  variable to true
                //   cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                // Set the driver path
                System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                //object of InternetExplorerDriver or InternetExplorer open
            } else {
                //String concatenation and string value print
                System.out.println("You Enter Wrong Browser Name Or Empty ,Please Enter Valid Browser Name !!!" + browserName.equalsIgnoreCase(""));
            }
        }
        // System.setProperty("webdriver.chrome.driver","src\\test\\resources\\BrowserDriver\\chromedriver.exe");
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("headless");
        //  options.addArguments("window-size=1200x600");
        //  driver = new ChromeDriver();
        driver.manage().window().maximize();//run time windows size maximize
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);//wait for 60 second before all test case
        // driver.get("https://demo.nopcommerce.com/");
        driver.get(loadProp.getProperty("URL"));//type URL by get property
    }

    public void closeBrowser() {
        driver.close();//close Browser
    }
}