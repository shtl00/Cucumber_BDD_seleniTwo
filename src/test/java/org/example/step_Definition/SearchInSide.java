package org.example.step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.SearchInSidePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchInSide extends DriverManager {
    DriverManager driverManager=new DriverManager();
    SearchInSidePage searchInSidePage = new SearchInSidePage();


    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

    }

    @And("^user \"([^\"]*)\" in input field$")
    public void user_in_input_field(String arg1) throws Throwable {

        searchInSidePage.typeOnSearchBox();
    }

    @When("^user click on search button$")
    public void user_click_on_search_button() throws Throwable {
        searchInSidePage.clickOnSearchButton();

    }

    @Then("^user can see search \"([^\"]*)\"$")
    public void user_can_see_search(String arg1) throws Throwable {

        boolean isSearchResultDisplayed= searchInSidePage.iShouldSeeSeachResult();



    }

}
