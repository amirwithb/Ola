package amazon.stepDefinition;

import amazon.page.LoginPage;
import amazon.utilities.ConfigurationReader;
import amazon.utilities.Driver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class amazonLogIn_Test extends LoginPage{

    @Test
    public void test1() {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

        amazon_logIn("username", "password");


    }

}
