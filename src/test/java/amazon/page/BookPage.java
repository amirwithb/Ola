package amazon.page;


import amazon.utilities.Driver;
import io.cucumber.java.sl.In;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
    public BookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement log_In;

    @FindBy(xpath = "//input[@type='email'][@id='ap_email']")
    public WebElement username_input;

    @FindBy(xpath = "//input[@id='continue'][@type='submit']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@type='password'][@id='ap_password']")
    public WebElement password_input;

    @FindBy(id = "signInSubmit")
    public WebElement SignIn;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
    public WebElement firstItem;

    @FindBy(id = "newBuyBoxPrice")
    public WebElement price_beforeCart;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(xpath = "(//span[@class='a-color-price hlb-price a-inline-block a-text-bold'])[1]")
    public WebElement price_InCart;

    @FindBy(xpath = "(//a[@id='hlb-ptc-btn-native'])[1]")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "(//tr[@class='small-line-height']/td)[2]")
    public WebElement price_atCheckout;




}
