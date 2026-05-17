package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef {

    LoginPage loginPage =
            new LoginPage(DriverFactory.getDriver());

    HomePage homePage =
            new HomePage(DriverFactory.getDriver());

    @Given("user launches application")
    public void user_launches_application() {

    }

    @When("user enters username")
    public void user_enters_username() {

        loginPage.enterUsername("Admin");
    }

    @And("user enters password")
    public void user_enters_password() {

        loginPage.enterPassword("admin123");
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {

        loginPage.clickLogin();
    }

    @Then("user should navigate to dashboard")
    public void user_should_navigate_to_dashboard() {

        Assert.assertTrue(homePage.isDashboardDisplayed());
    }
}