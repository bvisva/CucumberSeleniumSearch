package cucumbermain;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\CucumberSeleniumSearch\\src\\test\\java\\features",
glue = {"." },tags = "@testrun",
plugin = { "pretty" })
public class CucumberRunner {

}
