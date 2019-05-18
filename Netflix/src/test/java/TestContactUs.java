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


    //-------------Test case 2. Sign in button with valid info---------------


    public void accountValidEmailInput(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();


        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("wormike96@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("55689");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        }
        else{
            System.out.println("Failed");
            getScreenshot(driver);
        }
        quitDriver();
    }

    //-------------Test case 3. Sign in button with valid phone number  info---------------


    public void accountValidPhoneInput(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();


        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("9544948376");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("55689");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/div/div[2]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        }
        else{
            System.out.println("Failed");
            getScreenshot(driver);
        }
        quitDriver();
    }

    //-------------Test case 4. Sign in button with invalid password info---------------


    public void accountInValidPasswordInput(){
        contactUs.closeModalWindow();
        contactUs.signInButtonClick();


        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"id_userLoginId\"]")).sendKeys("9544948376");
        driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("556");
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleepFor(1);
        WebElement passwordTooShort = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[2]/div[2]"));
        if (passwordTooShort.isDisplayed()){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        }
        else{
            System.out.println("Failed");
            getScreenshot(driver);
        }
        quitDriver();
    }


    //-------------Test case 5. Checking if helpful article provided ---------------


    public void searchBoxNavToArticle(){
        contactUs.closeModalWindow();
        sleepFor(1);
        contactUs.searchBoxSendKeys("Why isnt Netflix working?");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div/div[2]/button[2]")).click();
        sleepFor(3);
        if(driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div")).isDisplayed()){
            System.out.println("Success. Message was shown up");
        }
        else{
            System.out.println("Fail.Message was not shown up");
        }
        quitDriver();
    }

    //-------------Test case 6. Checking if helpful article provided ---------------

    @Test

    public void searchBoxNavToArticleYes(){
        contactUs.closeModalWindow();
        sleepFor(1);
        contactUs.searchBoxSendKeys("Why isnt Netflix working?");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/div/div[2]/button[1]")).click();
        sleepFor(3);
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/form/div/textarea")).sendKeys("Thank you! You article was useful");
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"article-feedback-container\"]/div/form/button")).click();

        System.out.println("Success. Message was shown up. Message was sent");
        quitDriver();
    }
}
