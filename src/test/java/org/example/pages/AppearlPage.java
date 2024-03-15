package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppearlPage extends DriverManager {
    @FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    public WebElement apparelButton;

    @FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a")
    public WebElement clothingButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a")
    public WebElement levisJeans;

    @FindBy(id = "add-to-cart-button-30")
    public WebElement addToCart ;
    @FindBy(xpath= "//*[@id=\"bar-notification\"]/div/p/a")
    public WebElement clickOnVerification;

    public void  clickOnApparelButtonOnHomePage(){
        apparelButton.click();
    }
    public void selectClothingOption(){
        clothingButton.click();}

    public void selectLevisJeans(){

        levisJeans.click();
    }


    public boolean clckOnAddToCartButton(){

        addToCart.click();
        return true;
    }

    public void clickOnVerificationButton(){

        clickOnVerification.click();
    }
}



