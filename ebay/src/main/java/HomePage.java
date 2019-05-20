import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
            driver.get("https.ebay.com ");
            driver.findElement(By.linkText("java")).click();
            String URL1 = driver.getCurrentUrl();

            if (URL1.contains("ebay.com")) {
                System.out.println("It's an internal Link -Redirecting to another page in the different Application -Passed");
            } else {
                System.out.println("It's an external Link -Redirecting to another page in the same Application -Failed");
            }
            driver.navigate().back();
            driver.findElement(By.partialLinkText("ebay.com")).click();
            String URL2 = driver.getCurrentUrl();

            if (!URL2.contains("ebay.com")) {
                System.out.println("It's an internal Link");
            } else {
                System.out.println("It's an external Link");
                driver.close();


            }
        }
    }



