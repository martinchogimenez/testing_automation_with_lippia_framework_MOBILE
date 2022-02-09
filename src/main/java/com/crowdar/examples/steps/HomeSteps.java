package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @Then("Home page is displayed")
    public void isHomePageVisible() {
        HomeService.isViewLoaded();
    }


    @When("The user clicks the Show notifications button")
    public void theUserClicksTheShowNotificationsButton() {
        HomeService.selectButton();
    }

    @Then("The Show notifications button changes his state")
    public void theShowNotificationsButtonChangesHisState() {
        HomeService.verifyButtonState();
    }



    @And("The user clicks the Settings option")
    public void theUserClicksTheSettingsOption() {
        HomeService.selectSettings();
    }



    @When("The user select the navigation drawer")
    public void theUserSelectTheNavigationDrawer() {
        HomeService.openNavigationDrawer();
    }

    @And("The user select the Time tracker option")
    public void theUserSelectTheTimeTrackerOption() {
        HomeService.selectTimeTracker();
    }

    @And("The user select the add button")
    public void theUserSelectTheAddButton() {
        HomeService.selectAddButton();
    }

    @And("The user enter the hours and minutes to add")
    public void theUserEnterTheHoursAndMinutesToAdd() {
        HomeService.enterTime();

    }

    @And("The user select the project")
    public void theUserSelectTheProject() {
        HomeService.selectProject();

    }

    @And("The user select SAVE option")
    public void theUserSelectSAVEOption() {
        HomeService.selectSaveOption();
    }

    @Then("The new task is saved.")
    public void theNewTaskIsSaved() {
        HomeService.verifyTask();
    }
}
