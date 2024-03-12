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

    //checkout
    @FindBy(css="#updatecart")
    public WebElement updateShopping;

    @FindBy(css="#termsofservice")
    public WebElement termsAndCondition;

    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement checkout;
    @FindBy(css="body > div:nth-child(7) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h1:nth-child(1)")
    public WebElement welcomText;



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

//checkout

    public void clickOnUpdateShopping(){
        updateShopping.click();
    }
    public void clickOnTermsAndConditions(){
        termsAndCondition.click();
    }
    public void clickOnCheckout(){
        checkout.click();
    }
    public boolean welcomePleaseSignInText(){
        welcomText.isDisplayed();
        return true;
    }
    }

