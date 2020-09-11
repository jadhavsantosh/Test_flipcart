package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\pratmesh\\eclipse-workspace\\new\\Flipcart_Test\\src\\main\\java\\Features\\login.feature"
		,glue= {"StepDefinition"},
		dryRun=false
		
		)

public class TestRunner {
	
	
}
