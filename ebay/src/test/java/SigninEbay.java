import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class SigninEbay extends CommonAPI {
    Homepage homepage;

    @BeforeMethod
    public void initializationsSignInPage() {

        homepage = PageFactory.initElements(driver, Homepage.class);
    }


    public void gotoSignInPage() {
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }

    public void signin() {
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("kayes");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
        sleepFor(2);
    }
    public void Electronices(){
        driver.findElement(By.xpath("")).click();
        sleepFor(2);
    }


}
