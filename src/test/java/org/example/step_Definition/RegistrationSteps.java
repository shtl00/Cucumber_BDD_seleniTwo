package org.example.step_Definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationSteps extends DriverManager {
    RegistrationPage rp=new RegistrationPage();
    DriverManager driverManager=new DriverManager();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {

        driverManager.openUrl();

    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {

        rp.clickHomePageRegistration();


    }

    @When("^I select \"([^\"]*)\"$")
    public void i_select(String arg1) throws Throwable {
        boolean IsradioButtonSelected= rp.selectGenderRadioButton();
        assertThat(IsradioButtonSelected, Matchers.is(true));



    }

    @When("^I entre my first name \"([^\"]*)\" and last name \"([^\"]*)\"$")
    public void i_entre_my_first_name_and_last_name(String arg1, String arg2) throws Throwable {
        rp.firstNameInputBox();
        rp.lastNameInputBox();
    }

    @When("^I entre my email \"([^\"]*)\" and password\"([^\"]*)\"$")
    public void i_entre_my_email_and_password(String arg1, String arg2) throws Throwable {
        rp.emailIdInputField();
        rp.passwordInputField();
        rp.setConfirmPasswordInputField();

    }

    @When("^I click on \"([^\"]*)\" on registration page$")
    public void i_click_on_on_registration_page(String arg1) throws Throwable {
        rp.lastRegistrationButton();

    }

    @Then("^I should see \"([^\"]*)\" text on registration page$")
    public void i_should_see_text_on_registration_page(String arg1) throws Throwable {
        rp.confirmRegistrationCompletedText();

    }

    @Then("^The url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String arg1) throws Throwable {

    }
}
