package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchInSidePage extends DriverManager {
    DriverManager driverManager=new DriverManager();

   @FindBy(id ="small-searchterms")
    public WebElement searchInputFiled;
   @FindBy(xpath="//*[@id=\"small-search-box-form\"]/button")
   public WebElement searchButton;
   @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a")
public WebElement searchResult;


   public void typeOnSearchBox(){
       searchInputFiled.clear();
       searchInputFiled.sendKeys("phones");
   }
   public void clickOnSearchButton(){
       searchButton.click();
       driverManager.scrollTo(searchResult);

   }
   public boolean iShouldSeeSeachResult(){
      return searchResult.isDisplayed();
   }
}
