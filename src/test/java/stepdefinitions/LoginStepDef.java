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

    @Given("user launches browser")
    public void user_launches_browser() {

        // Browser already launched from Hooks
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {

        loginPage.enterUsername(username);
    }

    @And("user enters password {string}")
    public void user_enters_password(String password) {

        loginPage.enterPassword(password);
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {

        loginPage.clickLogin();
    }

    @Then("user should see {string}")
    public void user_should_see(String expectedResult) {

        if(expectedResult.equals("Dashboard displayed")) {

            Assert.assertTrue(
                    homePage.isDashboardDisplayed());

        } else {

            Assert.assertEquals(
                    loginPage.getInvalidCredentialText(),
                    expectedResult);
        }
    }
}