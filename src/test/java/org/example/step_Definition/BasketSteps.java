package org.example.step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.BasketPage;
import org.hamcrest.Matchers;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

public class BasketSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    BasketPage basketPage = new BasketPage();

    @Given("^user on home page$")
    public void user_on_home_page() throws Throwable {
        driver.get("https://demo.nopcommerce.com/");

    }

    @And("^user can search product$")
    public void user_can_search_product() throws Throwable {
        basketPage.searchProductOnsearchbox();
        basketPage.clickOnSearch();

    }

    @When("^user \"([^\"]*)\" product$")
    public void user_product(String arg1) throws Throwable {
        basketPage.selectProduct();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^user can see \"([^\"]*)\"in the basket$")
    public void user_can_see_in_the_basket(String arg1) throws Throwable {
        basketPage.productAddedonshoppingCart();
        basketPage.checkProductOnBasket();
    }

    // checkout scenario
    @Given("^update \"([^\"]*)\"$")
    public void update(String arg1) throws Throwable {
        basketPage.clickOnUpdateShopping();

    }

    @Given("^user select \"([^\"]*)\"$")
    public void user_select(String arg1) throws Throwable {
        basketPage.clickOnTermsAndConditions();

    }

    @When("^user click on \"([^\"]*)\"$")
    public void user_click_on(String arg1) throws Throwable {
        basketPage.clickOnCheckout();

    }

    @Then("^user can see\"([^\"]*)\"text$")
    public void user_can_see_text(String arg1) throws Throwable {
        basketPage.welcomePleaseSignInText();

        boolean IsconfirmSignInText = basketPage.welcomePleaseSignInText();
        assertThat(IsconfirmSignInText, Matchers.is(true));


    }


}
