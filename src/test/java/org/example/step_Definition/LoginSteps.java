package org.example.step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LoginSteps extends DriverManager {
    LoginPage loginpage = new LoginPage();
    DriverManager driverManager = new DriverManager();


    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        driver.findElement(By.id("APjFqb")).sendKeys("demo nopcommerce");
        driver.findElement(By.id("jZ2SBf")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
    }
    @When("^user entre (.*)and (.*)$")
   public void user_entre_and(String username, String password) throws Throwable {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement((By.id("Password"))).sendKeys(password);
        Thread.sleep(2000);
    }

    @And("^user click on next button$")
    public void user_click_on_next_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }

    @Then("^user can see \"([^\"]*)\"button$")
    public void user_can_see_button(String logout ) throws Throwable {
        driver.findElement(By.className("ico-logout")).click();
    }}