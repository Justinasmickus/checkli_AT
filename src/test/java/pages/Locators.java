package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Checkli{

        public static class Unregistered{
            public static By buttonMakeAFreeChecklist = By.xpath("//a[@class='btn-primary btn-large btn-lg text-decoration-none']");
            public static By aTagTitle = By.xpath("/html/body/div/div/div/div[1]/div[1]/div/section/h1/a");
            public static By textFieldAreaTitle = By.xpath("//span[@class='editable-controls']/textarea");
            public static By aTagDescription = By.xpath("//*[@class='field-edit ng-binding ng-scope editable editable-click editable-empty']");
            public static By textFieldAreaDescription = By.xpath("/html/body/div/div/div/div[1]/div[1]/div/section/div/form/span/textarea");

            public static By inputFieldBody = By.xpath("//input[@name='add-task']");

            public static By buttonSave = By.xpath("//button[@class='btn btn-small btn-default']");

            public static By contentBorder = By.xpath("//*[@class='content bordered']");
            public static By taskFieldtext = By.xpath("//p[@class='field-edit field-edit-list  field-item-0 task']");
        }
    }
}
