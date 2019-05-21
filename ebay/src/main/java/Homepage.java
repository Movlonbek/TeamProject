import org.openqa.selenium.By;

public class Homepage extends CommonAPI {

public void gotohomepage() {
    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("book");
    driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
    sleepFor(2);
}

    public void motors(){
    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
    sleepFor(2);

    }



    }

