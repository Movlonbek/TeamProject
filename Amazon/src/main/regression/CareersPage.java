package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class CareersPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")
            public static WebElement careers;

    @FindBy(css = "/html/body/div[2]/div[2]/div[2]/div/div/div[1]/ul/li[2]/a")
    public static WebElement teamsNavButton;


    public void clickCareers() {
        careers.click();

    }

    public void clickTeamsNavButton() {
        teamsNavButton.click();

    }


}
