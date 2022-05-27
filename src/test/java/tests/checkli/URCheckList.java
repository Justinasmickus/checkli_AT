package tests.checkli;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class URCheckList extends BaseTest {
    @BeforeMethod
    public void openLink() {
        pages.checkli.URCheckList.open();
        pages.checkli.URCheckList.clickMakeAFreeChecklist();
    }
    @Test
    public void testMakeAListItem(){


        String expectedTitle = "Testing title";
        String expectedDescription ="Testing description";
        String expectedBodyText = "Testing task";

        pages.checkli.URCheckList.clickOnTitle();
        pages.checkli.URCheckList.enterTitle(expectedTitle);

        pages.checkli.URCheckList.clickOnDescription();
        pages.checkli.URCheckList.enterDescription(expectedDescription);

        pages.checkli.URCheckList.clickOnBody();
        pages.checkli.URCheckList.enterBodyText(expectedBodyText);

        pages.checkli.URCheckList.clickOnSave();

        String actualBodyText = pages.checkli.URCheckList.readText();

        Assert.assertEquals(expectedBodyText,actualBodyText);


    }


}
