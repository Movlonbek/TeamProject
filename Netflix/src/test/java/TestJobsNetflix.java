import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJobsNetflix extends CommonAPI {
    public JobsPage jobsPage;

    @BeforeMethod
    public void init(){
        jobsPage = PageFactory.initElements(driver, JobsPage.class);
    }

    //-------------Test case 1. Search for Data, Analytics positions ---------------


    public void teamNavTestCaseDataAnalytics(){
        jobsPage.teamsNavButtonClick();
        sleepFor(1);
        String pageSource = driver.getPageSource();

        if(pageSource.indexOf("Data") != -1 && pageSource.indexOf("Analytics") != -1){
            System.out.println("Netflix provides positions at Data and Analytics field ");
        }
        else{
            System.out.println("They dont provide Data and Analytics field");
        }
        sleepFor(1);
    }

    //-------------Test case 2. Check if all the teams are clickable ---------------


    public void teamNavTestCaseIfClickable(){
        jobsPage.teamsNavButtonClick();
        sleepFor(1);
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-7r7chi.ef2k8yx2 > div > div.css-7td3p4.e16wqvzq3 > div:nth-child(1) > a > div > img")).click();
        sleepFor(3);

        driver.get("https://jobs.netflix.com/teams");
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-7r7chi.ef2k8yx2 > div > div.css-7td3p4.e16wqvzq3 > div:nth-child(2) > a > div > img")).click();
        sleepFor(3);
        driver.navigate().to("https://jobs.netflix.com/teams");
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-7r7chi.ef2k8yx2 > div > div.css-7td3p4.e16wqvzq3 > div:nth-child(3) > a > div > img")).click();
        sleepFor(3);
        driver.navigate().to("https://jobs.netflix.com/teams");
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-7r7chi.ef2k8yx2 > div > div.css-7td3p4.e16wqvzq3 > div:nth-child(4) > a > div > img")).click();
        sleepFor(3);
        driver.navigate().to("https://jobs.netflix.com/teams");
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-7r7chi.ef2k8yx2 > div > div.css-7td3p4.e16wqvzq3 > div:nth-child(5) > a > div > img")).click();
        sleepFor(3);
        driver.navigate().to("https://jobs.netflix.com/teams");
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-7r7chi.ef2k8yx2 > div > div.css-7td3p4.e16wqvzq3 > div:nth-child(6) > a > div > img")).click();
        sleepFor(3);
        driver.navigate().to("https://jobs.netflix.com/teams");

    }

    //-------------Test case 3. Check if the checkbox for US locations is selected ---------------


    public void locNavTestIfUsIsSelected(){
        jobsPage.locNavButtonClick();
        sleepFor(2);

        driver.findElement(By.cssSelector("#subpage-content > div > div.css-7r7chi.ef2k8yx2 > div > div > div > div:nth-child(2) > a:nth-child(1) > div > img")).click();
        sleepFor(1);
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-o2rael.ejb64032 > div.css-1ser9e4.ejb64037 > div.css-d4d1cv.ejb64031 > button")).click();
        sleepFor(1);
        Assert.assertTrue(driver.findElement(By.cssSelector("#los-angeles-california-cb")).isSelected());
        System.out.println("Success. US Locations are picked");
    }

    //-------------Test case 4. Check if the checkbox for Asian  locations is selected ---------------


    public void locNavTestIfAsiaIsSelected(){
        jobsPage.locNavButtonClick();
        sleepFor(2);

        driver.findElement(By.cssSelector("#subpage-content > div > div.css-7r7chi.ef2k8yx2 > div > div > div > div:nth-child(1) > a:nth-child(1) > div > img")).click();
        sleepFor(1);
        driver.findElement(By.cssSelector("#__next > div > main > section > div > div.css-o2rael.ejb64032 > div.css-1ser9e4.ejb64037 > div.css-d4d1cv.ejb64031 > button")).click();
        sleepFor(1);
        Assert.assertTrue(driver.findElement(By.cssSelector("#singapore-singapore-cb")).isSelected());
        System.out.println("Success. Asian locations are picked");
    }

    //-------------Test case 5. Checking slide toggle menu at LifeAtNetflix---------------

    @Test

    public void lifeAtNetflixSldeToggle(){
        jobsPage.lifeAtNetflixNavButtonClick();
        sleepFor(3);
        driver.findElement(By.cssSelector("#__next > div > header > section > div.css-1gmi4nu.e10x19ms8 > nav > span > div > div.css-ufq1tl.e1ibt3y90 > a:nth-child(1)")).click();
        sleepFor(3);
        driver.navigate().refresh();
        sleepFor(3);
        jobsPage.lifeAtNetflixNavButtonClick();
        sleepFor(3);
        driver.findElement(By.cssSelector("#__next > div > header > section > div.css-1gmi4nu.e10x19ms8 > nav > span > div > div.css-ufq1tl.e1ibt3y90 > a:nth-child(2)")).click();

    }


}
