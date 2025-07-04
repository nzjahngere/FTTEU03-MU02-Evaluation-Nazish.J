package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"E:\\\\STS\\\\workspace-spring-tools-for-eclipse-4.31.0.RELEASE\\\\CucumberImplementation\\\\FeatureFiles\\\\NaaptolEvaluation.feature"},
		glue = {"stepDefinitionsImplementation"}
		)

public class naaptolRunner extends AbstractTestNGCucumberTests{

}
