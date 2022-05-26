package pages.checkli;

import pages.Common;
import pages.Locators;

public class RegisterWithInvalidFields {

    public static void openLink(){

        Common.openUrl("https://www.checkli.com/");
    }

    public static void clickSignInButton(){
        Common.clickElement(Locators.Checkli.Registrer.buttonSignIn);
    }

    public static void clickCreateAnAccount() {
        Common.waitForElementToBeVisible(Locators.Checkli.Registrer.registerContainer);
        Common.clickElement(Locators.Checkli.Registrer.buttonCreateAnAccount);

    }

    public static void enterName(String text) {
        Common.waitForElementToBeVisible(Locators.Checkli.Registrer.inputFieldName);
        Common.clickElement(Locators.Checkli.Registrer.inputFieldName);
        Common.sendKeysToElement(Locators.Checkli.Registrer.inputFieldName, text);
    }

    public static void enterEmail(String text) {
        Common.clickElement(Locators.Checkli.Registrer.inputFieldEmail);
        Common.sendKeysToElement(Locators.Checkli.Registrer.inputFieldEmail,text);
    }

    public static void enterPassword(String text) {
        Common.clickElement(Locators.Checkli.Registrer.inputFieldPassword);
        Common.sendKeysToElement(Locators.Checkli.Registrer.inputFieldPassword,text);
    }

    public static void checkTerms() {
        Common.clickElement(Locators.Checkli.Registrer.checkboxTerms);
    }

    public static void clickRegisterButton() {
        Common.clickElement(Locators.Checkli.Registrer.buttonRegister);
    }

    public static String readErrorText() {
      return   Common.getElementText(Locators.Checkli.Registrer.fieldErrorText);
    }

//    public static void waitForRegisterForm() {
//        Common.waitForElementToBeVisible(Locators.Checkli.Registrer.registerContainer);
//    }
}
