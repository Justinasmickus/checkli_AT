package pages;

import org.openqa.selenium.By;

import static pages.Constants.FOLDERNAME;

public class Locators {

    public static class Checkli{

        public static class Unregistered{
            public static By buttonMakeAFreeChecklist = By.xpath("//a[@class='btn-primary btn-large btn-lg text-decoration-none']");
            public static By aTagTitle = By.xpath("/html/body/div/div/div/div[1]/div[1]/div/section/h1/a");
            public static By textFieldAreaTitle = By.xpath("//span[@class='editable-controls']/textarea");
            public static By aTagDescription = By.xpath("//*[@class='field-edit ng-binding ng-scope editable editable-click editable-empty']");
            public static By textFieldAreaDescription = By.xpath("/html/body/div/div/div/div[1]/div[1]/div/section/div/form/span/textarea");
            ////section/div[contains(@class, 'description')]//form

            public static By inputFieldBody = By.xpath("//input[@name='add-task']");

            public static By buttonSave = By.xpath("//button[@class='btn btn-small btn-default']");

            public static By contentBorder = By.xpath("//*[@class='content bordered']");
            public static By taskFieldtext = By.xpath("//p[@class='field-edit field-edit-list  field-item-0 task']");

            public static By fieldEnteredTask = By.xpath("//*[@id=''tasks']/li/div/div[1]/p");

        }
        public static class Registrer{
            public static By buttonSignIn = By.xpath("//div[@class='header-content flex']//a[contains(text(),'Sign in')]");
            public static By buttonCreateAnAccount = By.xpath("//a[contains(text(),'Create an account')]");

            public static By inputFieldName = By.xpath("//*[@name='name']");
            public static By inputFieldEmail = By.xpath("//*[@name='email']");
            public static By inputFieldPassword = By.xpath("//*[@name='password']");
            public static By checkboxTerms = By.xpath("//*[@name='terms']");
            public static By registerContainer = By.xpath("//*[@class='col-md-8 col-md-offset-2']");
            public static By buttonRegister = By.xpath("//*[@type='submit']");
            public static By fieldErrorText = By.xpath("//*[@class='help-block']");
        }
        public static class Login{
            public static By buttonLogin = By.xpath("//*[contains(text(),'Sign in')]");
            public static By containerSignIn = By.xpath("//*[@class='col-md-8 col-md-offset-2']");
            public static By inputEmail = By.xpath("//*[@name='email']");
            public static By inputPassword = By.xpath("//*[@name='password']");
            public static By buttonSubmitCredentials = By.xpath("//*[@name='submit']");
            public static By containerDashboard = By.xpath("//*[contains(text(),'My Dashboard')]");
            public static By profileSettingsAvatar =  By.xpath("//*[@class='avatar-small hidden-xs']");
            public static By buttonLogout = By.xpath("//*[contains(text(),'Logout')]");

            public static By buttonNewFolder = By.xpath("//*[contains(text(),'New Folder')]");
            public static By inputFolderName = By.xpath("//input[@type='text']");
            public static By fieldFolderDashboard = By.xpath("//*[contains(text(),'Organize Your Dashboard')]");
            public static By buttonCreateFolder = By.xpath("//*[contains(text(),'Create folder')]");
            public static By buttonFolderCreatedByMe = By.xpath("//*/p[contains(text(),'"+FOLDERNAME+"')]");
            public static By textOfCreatedFolder = By.xpath("//strong[contains(text(),'"+FOLDERNAME+"')]");
        }
    }
}
