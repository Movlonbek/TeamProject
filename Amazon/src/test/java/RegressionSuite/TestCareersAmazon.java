package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.CareersPage;
import regression.Homepage;

public class TestCareersAmazon extends CommonAPI {
    public CareersPage careersPage;

    @BeforeMethod
    public void init() {
        careersPage = PageFactory.initElements(CommonAPI.driver, CareersPage.class);
    }

    // Test case 1. Search for Data, Analytics positions

    @Test

    public void careersButtonClickable() {
        careersPage.clickCareers();
        sleepFor(1);
        String pageSource = driver.getPageSource();

        if (pageSource.indexOf("amazon jobs") != -1)  {
            System.out.println("success. careers button working ");

        } else {
            System.out.println("Failure. careers button not working");
        }
        sleepFor(1);
    }

    @Test
    public void teamNavBusinessCorporateDevelopment() {
        careersPage.clickTeamsNavButton();
        sleepFor(1);
        String pageSource = driver.getPageSource();

        if (pageSource.indexOf("business") != -1 && pageSource.indexOf("corporate development") != -1) {
        } else {
            System.out.println("They don't provide business and corporate development positions");
        }
        sleepFor(1);
    }


}

