import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    //Storing all the WebElements of the Homepage for the test
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/a]")
    public static WebElement homepage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]")
    public static WebElement signInButton;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/button" )
    public static WebElement getStarted;

    @FindBy (xpath ="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/nav/div[1]/div/span" )
    public static WebElement products;

    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/nav/div[2]/a")
    public static WebElement prices;





    @Test

public void homepageTestCase(){
    homepage.click();

    }

    public void signInButtonTestCase(){
        signInButton.click();

    }
    public void getStartedTestCase(){
        getStarted.click();
    }


}