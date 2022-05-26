package pages.checkli;

import pages.Common;
import pages.Locators;

public class URCheckList {

    public static void open(){

        Common.openUrl("https://www.checkli.com/");
    }
    public static void clickMakeAFreeChecklist(){
        Common.clickElement(Locators.Checkli.Unregistered.buttonMakeAFreeChecklist);
        Common.waitForElementToBeVisible(Locators.Checkli.Unregistered.contentBorder);
    }

    public static void clickOnTitle() {
        Common.clickElement(Locators.Checkli.Unregistered.aTagTitle);
    }

    public static void enterTitle(String text) {
        Common.sendKeysToElement(Locators.Checkli.Unregistered.textFieldAreaTitle,text);
    }

    public static void clickOnDescription() {
        Common.clickElement(Locators.Checkli.Unregistered.aTagDescription);
        Common.waitForElementToBeVisible(Locators.Checkli.Unregistered.textFieldAreaDescription);
    }

    public static void enterDescription(String text) {
        Common.sendKeysToElement(Locators.Checkli.Unregistered.textFieldAreaDescription, text);
    }

    public static void clickOnBody() {
        Common.clickElement(Locators.Checkli.Unregistered.inputFieldBody);
    }

    public static void enterBodyText(String text) {
        Common.sendKeysToElement(Locators.Checkli.Unregistered.inputFieldBody, text);
    }

    public static void clickOnSave() {

        Common.clickElement(Locators.Checkli.Unregistered.buttonSave);
        Common.waitForElementToBeVisible(Locators.Checkli.Unregistered.taskFieldtext);
    }

//    public static void waitForElements() {
//        Common.waitForElementToBeVisible(Locators.Checkli.Unregistered.contentBorder);
//    }

//    public static void waitForInputElement() {
//        Common.waitForElementToBeVisible(Locators.Checkli.Unregistered.textFieldAreaDescription);
//    }

    public static String readText() {
        return Common.getElementText(Locators.Checkli.Unregistered.taskFieldtext);
    }

    public static void clickOnTask() {
//        Common.waitForElementToBeVisible(Locators.Checkli.Unregistered.fieldEnteredTask);
        Common.clickElement(Locators.Checkli.Unregistered.fieldEnteredTask);
    }

//    public static void waitForTaskElement() {
//        Common.waitForElementToBeVisible(Locators.Checkli.Unregistered.taskFieldtext);
//    }
}
