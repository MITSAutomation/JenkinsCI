package testrunner;



import org.junit.runner.RunWith;



/*import org.testng.annotations.Test;*/
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*
import cucumber.api.testng.AbstractTestNGCucumberTests;
*/

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\vybha\\git\\JenkinsAI\\JenkinsAI\\src\\test\\java\\featurespackage\\features.feature",
		glue= {"stepdefinationpackage"}
	 
		)

public class testrunner 
{				     
	
}