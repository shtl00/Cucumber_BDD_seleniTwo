package org.example.step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.NextSearchPage;

public class NextSearch extends DriverManager {
    DriverManager dm =new DriverManager();

    NextSearchPage np=new NextSearchPage();


    @Given("^User click on \"([^\"]*)\"$")
    public void user_click_on(String arg1) throws Throwable {
      dm.openUrl();
      np.acceptAllCookies();
      np.searchBox();
    }

    @When("^user search\"([^\"]*)\"$")
    public void user_search(String arg1) throws Throwable {
        np.tshirtSearchInputField();
        np.clickOnSearButton();

    }

    @Then("^user can see \"([^\"]*)\"as result\\.$")
    public void user_can_see_as_result(String arg1) throws Throwable {

        np.searchResultList();

    }

}
