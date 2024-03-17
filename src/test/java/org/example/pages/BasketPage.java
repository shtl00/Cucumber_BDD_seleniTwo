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

    // new scenario
 @FindBy(xpath ="//input[@id='Email']")
 public WebElement emailId;

 @FindBy(xpath="//input[@id='Password']")
 public WebElement password;

 @FindBy(xpath  = "//button[normalize-space()='Log in']")
 public WebElement login;

 @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
 public WebElement shoppingCart;



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

    public void entreEmailId(){
        emailId.clear();
        emailId.sendKeys("parmarsheetal@ymail.com");
    }
    public void entrePassword(){
        password.clear();
        password.sendKeys("abcd123");
    }
    public void clickOnLogInButton(){
        login.click();
    }
    public boolean shoppingCartText(){
        shoppingCart.isDisplayed();
        return true;
    }
    }

