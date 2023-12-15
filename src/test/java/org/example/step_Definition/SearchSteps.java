package org.example.step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.By;

public class SearchSteps extends DriverManager{
    DriverManager driverManager=new DriverManager();

    @Given("^browser is open$")
    public void browser_is_open() throws Throwable {
        acceptCookies();
}
@Given("^user is on googlesearch page$")
    public void user_is_on_googlesearch_page() throws Throwable {


    }

    @When("^user enter a text in search box$")
    public void user_enter_a_text_in_search_box() throws Throwable {
driver.findElement(By.id("APjFqb")).sendKeys("demo nopcommerce");


    }

    @When("^hits entre user nevigate search result$")
    public void hits_entre_user_nevigate_search_result() throws Throwable {
        driver.findElement(By.id("jZ2SBf")).click();

        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a")).click();


    }


}
