package amazon.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){
    }

    public static WebDriver driver;

   public static WebDriver getDriver(){

       if(driver ==null){

           String browser = ConfigurationReader.getProperty("browser");

           switch (browser){

               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;

               case "firefox":
                   WebDriverManager.chromedriver().setup();
                   driver = new FirefoxDriver();
                   break;

               case "chorme-headless":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                   break;

           }
       }

            return driver;
   }


   public static void closeDriver(){
       if(driver != null){
           driver.quit();
           driver = null;
       }
   }

}
