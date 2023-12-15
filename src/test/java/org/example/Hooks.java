package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager driverManager=new DriverManager();


    @Before
    public void setUpMethod() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.maxBrowser();
        driverManager.openUrl();

    }
    @After
    public void tearDownMethod() throws InterruptedException {
        driverManager.sleepBrowser(5000);
        driverManager.closeBrowser();


    }
}
