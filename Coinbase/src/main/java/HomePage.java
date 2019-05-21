import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    //Storing all the WebElements of the Homepage for the test


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]")
    public static WebElement signInButton;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/button" )
    public static WebElement getStarted;

    @FindBy (xpath ="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/nav/div[1]/div/span" )
    public static WebElement products;

    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/nav/div[2]/a")
    public static WebElement prices;

    @FindBy(xpath = "//*[@id=\"main\"]/div/form/input")
    public static WebElement email;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[2]/a[2]")
    public static WebElement commerce;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[2]/a[3]")
    public static WebElement custody;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[2]/a[4]")
    public static WebElement earn;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div[9]/div/div/div[2]/a[5]")
    public static WebElement pro;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[2]/a[6]")
    public static WebElement USDcoin;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[2]/a[7]")
    public static WebElement wallet;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[3]/a[1]")
    public static WebElement buyBitcoin;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[3]/a[2]")
    public static WebElement buyBitcoinCash;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[3]/a[3]")
    public static WebElement buyEthereum;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[3]/a[4]")
    public static WebElement buyLitecoin;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[9]/div/div/div[3]/a[5]")
    public static WebElement buyXRP;




    public void signInClick(){
        signInButton.click();
    }
    public void getStartedClick(){
        getStarted.click();
    }
    public void productsClick(){
        products.click();
    }
    public void pricesClick(){
        prices.click();
    }
    public void emailInput(String email1){
        email.sendKeys(email1);
    }

    public void commerceClick(){
        commerce.click();
    }

    public void custodyClick(){
        custody.click();
    }

    public void earnClick(){
        earn.click();
    }

    public void proClick(){
        pro.click();
    }

    public void USDcoinClick(){
        USDcoin.click();
    }

    public void walletClick(){
        wallet.click();
    }

    public void buyBitcoinClick(){
        buyBitcoin.click();
    }

    public void buyBitcoinCashClick(){
        buyBitcoinCash.click();
    }

    public void buyEthereumClick(){
        buyEthereum.click();
    }

    public void buyLitecoinClick(){
        buyLitecoin.click();
    }

    public void buyXRPClick(){
        buyXRP.click();
    }
}
