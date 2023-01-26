package runneramazon;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	 features= "features",
      glue = "stepdefamazon"
		
		
		)




public class runneramaz extends AbstractTestNGCucumberTests {

}
