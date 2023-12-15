package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends DriverManager {
    DriverManager driverManager=new DriverManager();
    @FindBy(id ="small-searchterms")
    public WebElement searchInputFiled;
    @FindBy(xpath="//*[@id=\"small-search-box-form\"]/button")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement addproduct;

    @FindBy(xpath="//*[@id=\"bar-notification\"]/div/span")
    public WebElement productAddedMessage;
    @FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
    public WebElement clickOnBasket;



    public void searchProductOnsearchbox(){
        searchInputFiled.clear();
        searchInputFiled.sendKeys("Phones");}

        public void clickOnSearch(){
            searchButton.click();
        }
        public void selectProduct(){
        addproduct.click();
        }
        public void productAddedonshoppingCart(){productAddedMessage.click();
        }
        public void checkProductOnBasket(){
        clickOnBasket.click();
        }


    }

