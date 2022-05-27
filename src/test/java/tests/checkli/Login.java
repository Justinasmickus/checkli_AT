package tests.checkli;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.Constants.*;

public class Login extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.checkli.Login.open();
    }

    @Test

    public void login() {

        String expectedDashboardText = "My Dashboard";

        pages.checkli.Login.pressSignIn();
        pages.checkli.Login.enterLoginCredentials(USERNAME, PASSWORD);
        pages.checkli.Login.submitLoginCredentials();

        String actualDashboardText = pages.checkli.Login.readDashboardText();

        Assert.assertTrue(actualDashboardText.contains(expectedDashboardText));

    }

    @Test
    public void addNewFolder() {
        pages.checkli.Login.pressSignIn();
        pages.checkli.Login.enterLoginCredentials(USERNAME, PASSWORD);
        pages.checkli.Login.submitLoginCredentials();

        pages.checkli.Login.selectNewFolder();
        pages.checkli.Login.enterFolderName(FOLDERNAME);
        pages.checkli.Login.pressCreateFolder();
        pages.checkli.Login.refresh();
        pages.checkli.Login.selectCreatedFolder();

        String actualFolderName = pages.checkli.Login.getFolderName();

        Assert.assertEquals(actualFolderName, FOLDERNAME);

    }

    @Test
    public void logout() {
        pages.checkli.Login.pressSignIn();
        pages.checkli.Login.enterLoginCredentials(USERNAME,  PASSWORD);
        pages.checkli.Login.submitLoginCredentials();

        pages.checkli.Login.pressLogout();

        Assert.assertTrue(pages.checkli.Login.isDisplayed());
    }

}
