package tests.checkli;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class RegisterWithInvalidFields extends BaseTest {
    @BeforeMethod
    public void open() {
        pages.checkli.RegisterWithInvalidFields.openLink();
        pages.checkli.RegisterWithInvalidFields.clickSignInButton();
        pages.checkli.RegisterWithInvalidFields.clickCreateAnAccount();

    }

    @Test
    public void emptyInputFields(){


        pages.checkli.RegisterWithInvalidFields.enterName("");
        pages.checkli.RegisterWithInvalidFields.enterEmail("");
        pages.checkli.RegisterWithInvalidFields.enterPassword("");
        pages.checkli.RegisterWithInvalidFields.checkTerms();

        pages.checkli.RegisterWithInvalidFields.clickRegisterButton();

        String actualErrorMessage = pages.checkli.RegisterWithInvalidFields.readErrorText();

        Assert.assertTrue(actualErrorMessage.contains("required"));

    }
    @Test
    public void existingUserEmail(){
        String expectedErrorMessage = "The email has already been taken.";
        pages.checkli.RegisterWithInvalidFields.enterName("asdasd");
        pages.checkli.RegisterWithInvalidFields.enterEmail("testuotojs@gmail.com");
        pages.checkli.RegisterWithInvalidFields.enterPassword("asdasdasd");
        pages.checkli.RegisterWithInvalidFields.checkTerms();

        pages.checkli.RegisterWithInvalidFields.clickRegisterButton();

        String actualErrorMessage = pages.checkli.RegisterWithInvalidFields.readErrorText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

}
