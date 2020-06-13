package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "not @ignore",
        plugin = {"pretty", "html:target/cucumber","json:json_output/cucumber.json", "junit:junit_xml/cucumbr.xml"},//to generate different types of reporting
        dryRun = false,//to check the mapping is proper between feature and step def file
        strict = true,//it will check if any stepdefination is not define inside step defination file
        features="src/main/resources/",//the path of the feature file
        glue = "stepdefinations",//the path of the stepdefination file
        monochrome = true//display the console output in a proper readable format
)
public class TestRunner {
}
