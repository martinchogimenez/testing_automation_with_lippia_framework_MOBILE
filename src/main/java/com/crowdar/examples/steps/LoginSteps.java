package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    @Then("Login page is displayed")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }



    @When("The user logs in the application with: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

}
