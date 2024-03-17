package org.example.step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.AppearlPage;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class AppearlSteps extends DriverManager {
    DriverManager driverManager=new DriverManager();
    AppearlPage ap=new AppearlPage();



    @Given("^click on \"([^\"]*)\"button$")
    public void click_on_button(String arg1) throws Throwable {
driver.getCurrentUrl();
    }

    @Given("^select \"([^\"]*)\"option$")
    public void select_option(String arg1) throws Throwable {
        ap.clickOnApparelButtonOnHomePage();


    }
    @When("^select \"([^\"]*)\"$")
    public void select(String arg1) throws Throwable {
        ap.selectClothingOption();
        ap.selectLevisJeans();


    }

    @Then("^user able to add product \"([^\"]*)\"$")
    public void user_able_to_add_product(String arg1) throws Throwable {
        ap.clckOnAddToCartButton();
        boolean  IsjeansAdded= ap.clckOnAddToCartButton();
        assertThat(IsjeansAdded, Matchers.is(true));




    }


}
