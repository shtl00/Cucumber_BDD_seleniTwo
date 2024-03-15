package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.bouncycastle.cms.RecipientId.password;

public class RegistrationPage extends DriverManager {
    DriverManager driverManager=new DriverManager();
    @FindBy(className="ico-register")
    public WebElement homepageRegistration;

    @FindBy(id="gender-female")
    public WebElement genderFemale;

    @FindBy(id="FirstName")
    public WebElement firstName;

    @FindBy(id="LastName")
    public WebElement lastName;

    @FindBy(id="Email")
    public WebElement emailId;

    @FindBy(id="Password")
    public WebElement firstPassword;

    @FindBy(id="ConfirmPassword")
    public WebElement confirmPasswordInputBox;

    @FindBy(id="register-button")
    public WebElement registrationButton;

    @FindBy(className = "result")
    public WebElement registrationCompleted;

    @FindBy(className = "result")
    public WebElement result;

    public void clickHomePageRegistration(){
        homepageRegistration.click();}

    public boolean selectGenderRadioButton(){
        genderFemale.isSelected();
        return true;
    }

    public void firstNameInputBox(){
        firstName.clear();
        firstName.sendKeys("sheetal");}
    public void lastNameInputBox(){
        lastName.clear();
        lastName.sendKeys("parmar");}

    public void emailIdInputField(){
        emailId.clear();
        emailId.sendKeys("sheetalparmar@ymail.com");

    }

    public void passwordInputField(){
        firstPassword.clear();
        firstPassword.sendKeys("abcd123");}

    public void setConfirmPasswordInputField(){
        confirmPasswordInputBox.clear();
        confirmPasswordInputBox.sendKeys("abcd123");}
    public void lastRegistrationButton(){
        registrationButton.click();}

    public boolean confirmRegistrationCompletedText(){
        registrationCompleted.getText();
        return true;
    }
    public void registrationReuslt(){result.isDisplayed();
    }
    public void entreRegistrationDetails(String firstname,String lastname,String email,String password,String confirmpassword) throws InterruptedException {
        firstName.clear();
        firstName.sendKeys(firstname);
        lastName.clear();
        lastName.sendKeys(lastname);
        emailId.clear();
        int myRandomNumber= driverManager.generateRandomNumber();
        emailId.sendKeys(myRandomNumber+ email);
        firstPassword.clear();
        firstPassword.sendKeys(password);
        confirmPasswordInputBox.clear();
        confirmPasswordInputBox.sendKeys(confirmpassword);
        driverManager.sleepBrowser(4000);


    }}
