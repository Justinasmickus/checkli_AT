package pages.checkli;

import pages.Common;
import pages.Locators;

public class Login {


    public static void open(){

        Common.openUrl("https://www.checkli.com/");
    }

    public static void pressSignIn() {
        Common.waitForElementToBeVisible(Locators.Checkli.Login.buttonLogin);
        Common.clickElement(Locators.Checkli.Login.buttonLogin);
        Common.waitForElementToBeVisible(Locators.Checkli.Login.containerSignIn);

    }

    public static void enterLoginCredentials(String email, String password) {
        Common.clickElement(Locators.Checkli.Login.inputEmail);
        Common.sendKeysToElement(Locators.Checkli.Login.inputEmail, email);

        Common.clickElement(Locators.Checkli.Login.inputPassword);
        Common.sendKeysToElement(Locators.Checkli.Login.inputPassword, password);

    }

    public static void submitLoginCredentials() {
        Common.clickElement(Locators.Checkli.Login.buttonSubmitCredentials);
        Common.waitForElementToBeVisible(Locators.Checkli.Login.containerDashboard);
    }

    public static String readDashboardText() {
       return Common.getElementText(Locators.Checkli.Login.containerDashboard);
    }

    public static void pressLogout() {
        Common.hover(Locators.Checkli.Login.profileSettingsAvatar);
        Common.clickElement(Locators.Checkli.Login.buttonLogout);
    }

    public static boolean isDisplayed() {
     return    Common.isElementDisplayed(Locators.Checkli.Login.buttonLogin);
    }

    public static void selectNewFolder() {
        Common.clickElement(Locators.Checkli.Login.buttonNewFolder);
    }

    public static void enterFolderName(String text) {
        Common.waitForElementToBeVisible(Locators.Checkli.Login.fieldFolderDashboard);
        Common.clickElement(Locators.Checkli.Login.inputFolderName);
        Common.sendKeysToElement(Locators.Checkli.Login.inputFolderName,text);
    }

    public static void pressCreateFolder() {
        Common.clickElement(Locators.Checkli.Login.buttonCreateFolder);
    }

    public static void refresh() {
        Common.refresh();
    }

    public static void selectCreatedFolder() {
        Common.clickElement(Locators.Checkli.Login.buttonFolderCreatedByMe);
    }

    public static String getFolderName() {
        Common.waitForElementToBeVisible(Locators.Checkli.Login.textOfCreatedFolder);
        return Common.getElementText(Locators.Checkli.Login.textOfCreatedFolder);
    }
}
