package RegressionSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.CommonAPI;
import regression.Homepage;

public class TestHomepage  extends Homepage {
     Homepage homePage;


    @BeforeMethod
     public void init() {
        homePage = PageFactory.initElements(driver, Homepage.class);
        driver.getCurrentUrl();
    }

    //Testcase 1. Testing if Input error shows up


    @Test
    public void accountInputError() {
        homePage.clickAccount();
        sleepFor(3);
        homePage.getEmailOrNumber();
        homePage.getSignInPassword();
        sleepFor(5);
        WebElement inputError = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1"));
        if (inputError.isDisplayed()) {
            System.out.println("Input Error was displayed. Text: " + inputError.getText());
            getScreenshot(driver);
        } else {
            System.out.println("Failed to show InputError");
            getScreenshot(driver);
        }
        quitDriver();
    }

    //Testcase 2. Testing the error message if login with invalid info



    @Test
    public void accountValidEmailInput(){
        homePage.clickAccount();
        sleepFor(3);
        homePage.SignIn("myemail@gmail.com", "password");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1"));
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

    //Testcase 3. Testing the error message if login with invalid phone number info


    @Test
    public void accountValidPhoneInput(){
        homePage.clickAccount();
        sleepFor(2);
        homePage.SignIn("3347-xxx-xxxx", "password");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1"));
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

    //Testcase 4. Testing sign in button

    @Test
    public void signInButtonTest(){
        homePage.signInButton();
        sleepFor(1);
        homePage.SignIn("myemail@gmail.com", "password");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
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



    //Testcase 5. Testing creating amazon account

    @Test
    public void createAmazonAccount() {
        homePage.CreateYourAmazonAccount();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("xyz");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("myemail@gmail.com");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("password");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        sleepFor(3);
        if(driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div/h4")).getText().indexOf("important message")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
        quitDriver();
    }

    //Testcase 6. Check orders on homepage



    @Test
    public void HomepageOrders(){
        homePage.clickOrders();
        sleepFor(1);
        driver.navigate().to("sign in page");
        sleepFor(1);
        System.out.println(driver.getPageSource());
        sleepFor(1);
        quitDriver();
    }

    //Testcase 7. Check Try prime on homepage

    @Test
    public void TryPrime(){
        homePage.clickTryPrime();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"prime-header-CTA\"]/span/input")).click();
        sleepFor(1);
        driver.navigate().to("sign in page");
        System.out.println(driver.getPageSource());
        sleepFor(1);
        quitDriver();
    }

    //Testcase 8. Check add to cart on homepage

    @Test
    public void addToCart(){
        homePage.clickCart();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/h1")).getText().indexOf("Your Shopping Cart is empty")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
        quitDriver();
    }

    //Testcase 9. Check search box on homepage

    @Test
    public void searchBoxTest(){
        homePage.searchBox();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("anything you want");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        sleepFor(1);
        System.out.println(driver.getPageSource());
        quitDriver();
    }

    //Testcase 10. Check deals Of The Day on homepage


    @Test
    public void dealsOfTheDay(){
        homePage.ClickShopDealsOfTheDay();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]")).getText().indexOf("Today's Deals")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
        quitDriver();
    }




}