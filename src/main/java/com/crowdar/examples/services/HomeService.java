package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.VERIFICATION_LABEL);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.VERIFICATION_LABEL), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void settingsPage() {
        MobileActionManager.waitVisibility(HomeConstants.MENU_LOCATOR);
        MobileActionManager.click(HomeConstants.MENU_LOCATOR);
        MobileActionManager.click(HomeConstants.SETTINGS_LOCATOR);
    }

    public static void selectButton() {
        MobileActionManager.waitVisibility(HomeConstants.SHOWNOTIF_LOCATOR);
        MobileActionManager.click(HomeConstants.SHOWNOTIF_LOCATOR);
    }

    public static void verifyButtonState() {
        MobileActionManager.waitVisibility(HomeConstants.SHOWNOTIF_LOCATOR);
        Assert.assertTrue(MobileActionManager.getText(HomeConstants.SHOWNOTIF_LOCATOR).equals("OFF"));
    }

    public static void openNavigationDrawer() {
        MobileActionManager.waitVisibility(HomeConstants.MENU_LOCATOR);
        MobileActionManager.click(HomeConstants.MENU_LOCATOR);
    }

    public static void selectSettings() {
        MobileActionManager.waitVisibility(HomeConstants.SETTINGS_LOCATOR);
        MobileActionManager.click(HomeConstants.SETTINGS_LOCATOR);
    }

    public static void selectTimeTracker() {
        MobileActionManager.waitVisibility(HomeConstants.TIME_TRACKER_LOCATOR);
        MobileActionManager.click(HomeConstants.TIME_TRACKER_LOCATOR);
    }

    public static void selectAddButton() {
        MobileActionManager.waitVisibility(HomeConstants.FLOATING_BUTTON);
        MobileActionManager.click(HomeConstants.FLOATING_BUTTON);
    }

    public static void enterTime() {
        MobileActionManager.waitVisibility(HomeConstants.NUMBER_PICKER);
        MobileActionManager.click(HomeConstants.NUMBER_PICKER);

    }

    public static void selectProject() {
        MobileActionManager.waitVisibility(HomeConstants.PROJECT_LOCATOR);
        MobileActionManager.click(HomeConstants.PROJECT_LOCATOR);
        MobileActionManager.click(HomeConstants.PROJECT_OPTION_LOCATOR);


    }

    public static void selectSaveOption() {
        MobileActionManager.waitVisibility(HomeConstants.FLOATING_BUTTON);
        MobileActionManager.click(HomeConstants.FLOATING_BUTTON);
    }

    public static void verifyTask() {
        MobileActionManager.waitVisibility(HomeConstants.TIME_DURATION);
        Assert.assertTrue(MobileActionManager.getText(HomeConstants.TIME_DURATION).equals("01:00:00"));
    }
}
