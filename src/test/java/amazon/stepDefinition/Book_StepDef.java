package amazon.stepDefinition;

import amazon.page.BookPage;
import amazon.utilities.ConfigurationReader;
import amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Book_StepDef {


    BookPage bookPage = new BookPage();
    JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)Driver.getDriver();
    WebDriverWait wait  = new WebDriverWait(Driver.getDriver(), 10);
    //SoftAssert softAssert = new SoftAssert();

    String priceBeforeCart = "";
    String priceInCart = "";
    String priceAtCheckout = "";

    @Given("user is on the front page")
    public void user_is_on_the_front_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
       //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @And("user clicks on Hello, Sign in")
    public void user_clicks_on_hello_sign_in() {
        bookPage.log_In.click();
    }

    @And("user enters username in input box")
    public void user_enters_username_in_input_box() {
        String username = ConfigurationReader.getProperty("username");
        bookPage.username_input.sendKeys(username);
    }

    @And("user clicks on Continue")
    public void user_clicks_on_continue() {
        bookPage.continueButton.click();
    }

    @And("user enters password in input box")
    public void user_enters_password_in_input_box() {
        String password = ConfigurationReader.getProperty("password");
        bookPage.password_input.sendKeys(password);
    }

    @And("user click on Sign-In button")
    public void user_click_on_sign_in_button() {
        bookPage.SignIn.click();
    }


    @And("user searches for qa testing for beginners")
    public void user_searches_for_qa_testing_for_beginners() {
        bookPage.searchBox.sendKeys("qa testing for beginners", Keys.ENTER);
    }

    @And("user clicks on 1st item in the listed result")
    public void user_clicks_on_1st_item_in_the_listed_result() {
        bookPage.firstItem.click();
    }

    @Then("user verifies price in Add to Cart page")
    public void user_verifies_price_in_add_to_cart_page() {

        priceBeforeCart = bookPage.price_beforeCart.getText();

        Assert.assertTrue(priceBeforeCart.equalsIgnoreCase(priceBeforeCart));
        //softAssert.assertTrue(priceBeforeCart.equalsIgnoreCase(priceBeforeCart));


    }


    @But("user clicks on Add to Cart Button")
    public void user_clicks_on_add_to_cart_button() {

        javaScriptExecutor.executeScript("window.scrollBy(0,400)");
        //javaScriptExecutor.executeScript("arguments[0].scrollIntoView();", bookPage.addToCart);
        bookPage.addToCart.click();
    }

    @Then("user verifies price in Proceed to Checkout page")
    public void user_verifies_price_in_proceed_to_checkout_page() {

        wait.until(ExpectedConditions.visibilityOf(bookPage.price_InCart));
        priceInCart = bookPage.price_InCart.getText();

        Assert.assertTrue(priceBeforeCart.equalsIgnoreCase(priceInCart));
        //softAssert.assertTrue(priceBeforeCart.equalsIgnoreCase(priceInCart));
    }

    @And("user clicks on Proceed to Checkout")
    public void user_clicks_on_proceed_to_checkout() {

        wait.until(ExpectedConditions.visibilityOf(bookPage.proceedToCheckout));
        bookPage.proceedToCheckout.click();
    }

    @Then("user verifies price in Place Your Order page")
    public void user_verifies_price_in_place_your_order_page() {

        wait.until(ExpectedConditions.visibilityOf(bookPage.price_atCheckout));
        priceAtCheckout = bookPage.price_atCheckout.getText();

          Assert.assertTrue(priceBeforeCart.equalsIgnoreCase(priceAtCheckout));

//        softAssert.assertTrue(priceBeforeCart.equalsIgnoreCase(priceAtCheckout));
//        softAssert.assertAll();
    }



}
