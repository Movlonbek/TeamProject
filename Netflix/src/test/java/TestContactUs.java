import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestContactUs extends  CommonAPI {
    ContactUs contactUs;


    @BeforeMethod
    public void init(){
        contactUs = PageFactory.initElements(driver,ContactUs.class);
    }



    //-------------Test case 1. Sign in button with invalid info---------------

    @Test
    public void signInButtonTestCaseInvalid(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();
        sleepFor(5);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("347");
        sleepFor(2);
        WebElement inputError = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[1]/div[2]"));
        if(inputError.isDisplayed()){
            System.out.println("Input Error was displayed. Text: " + inputError.getText() );
            getScreenshot(driver);
        }
        else{
            System.out.println("Failed to show InputError");
            getScreenshot(driver);
        }
        quitDriver();
    }
}
