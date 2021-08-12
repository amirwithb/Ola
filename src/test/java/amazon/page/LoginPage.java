package amazon.page;

import amazon.utilities.ConfigurationReader;
import amazon.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class LoginPage extends BookPage{

    public LoginPage(){
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


    public void amazon_logIn(String username, String password)  {

        log_In.click();
        String userName = ConfigurationReader.getProperty(username);
        username_input.sendKeys(userName + Keys.ENTER);

        String Password = ConfigurationReader.getProperty(password);
        password_input.sendKeys(Password + Keys.ENTER);

    }



}
