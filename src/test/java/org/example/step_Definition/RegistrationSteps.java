package org.example.step_Definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.Is.is;

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
    public void i_should_see_text_on_registration_page(String expectedText) throws Throwable {
        rp.confirmRegistrationCompletedText();
    }

    @Then("^The url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String arg1) throws Throwable {

     rp.registrationReuslt();

      //  System.out.println(myActualCurrentUrl);
        //assertThat(myActualCurrentUrl, containsString(expectedUrlText));

    }
    @When("^I entre following data for registration$")
    public void i_entre_following_data_for_registration(DataTable dataTable) throws Throwable {
        List<Map<String, String>> myData = dataTable.asMaps(String.class, String.class);
        System.out.println(myData);
        try {
            rp.entreRegistrationDetails(
                    myData.get(0).get("firstname"),
                    myData.get(0).get("lastname"),
                    myData.get(0).get("emailId"),
                    myData.get(0).get("password"),
                    myData.get(0).get("confirmpassword"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean IsconfirmText=rp.confirmRegistrationCompletedText();
        assertThat(IsconfirmText, Matchers.is(true));
        rp.lastRegistrationButton();



    }


}
