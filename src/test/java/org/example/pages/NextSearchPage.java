package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextSearchPage extends DriverManager {

    @FindBy(id="onetrust-accept-btn-handler")
    WebElement acceptCookies;

    @FindBy(id ="header-big-screen-search-box")
    WebElement searchinputField;

    @FindBy(xpath="//*[@id=\"header-search-form\"]/button/img")
    WebElement searchButton;

    @FindBy(className = "MuiTypography-root MuiTypography-body1 produc-hj8ksk")
    WebElement searchResult;

    public void acceptAllCookies(){
        acceptCookies.click();
    }

    public void searchBox(){
        searchinputField.click();
    }
    public void tshirtSearchInputField(){
        searchinputField.sendKeys("tshirt");
    }
    public void clickOnSearButton(){
        searchButton.click();
    }
    public void searchResultList(){
        searchResult.isDisplayed();
    }

}
