package amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

         plugin =  {"html:target/report.html",
                    "json:target/cucmber.json",
                    "rerun:target/rerun.txt"
                   },

         features = "src/test/resources/feature",
         glue = "amazon/stepDefinition",
         dryRun = false,
         tags = "@cart"

)


public class CuksRunner {
}
