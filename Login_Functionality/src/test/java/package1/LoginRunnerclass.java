package package1;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/LoginReport/reports.json"},tags ="@tag1")

public class LoginRunnerclass {
	

}
