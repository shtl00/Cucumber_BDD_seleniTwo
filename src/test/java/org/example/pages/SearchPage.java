package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverManager {
    @FindBy(id="APjFqb")
    public WebElement searchresult;



}
