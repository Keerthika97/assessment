package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;

public class Login_class {
	static {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		   }	
	 WebDriver driver=new ChromeDriver();
	@Given("navigate to home page")
	public void navigate_to_home_page() 
	{
	    //driver.get("http://newtours.demoaut.com");
		driver.get("http://newtours.demoaut.com");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password(DataTable dt)
	{
	    List<Map<String,String>> ob=dt.asMaps(String.class,String.class);
	    for(int i=0;i<ob.size();i++)
	    {
	    WebElement username=driver.findElement(By.name("userName"));
	    username.sendKeys(ob.get(i).get("username"));
	    WebElement password=driver.findElement(By.name("password"));
	    password.sendKeys(ob.get(i).get("password"));
	    driver.get("http://newtours.demoaut.com/mercuryreservation.php");
	    WebElement signin=driver.findElement(By.xpath("//div/input[@name='login']"));
	    signin.click();
	   // driver.get("http://newtours.demoaut.com/mercuryreservation.php");
	    
	    
	    }
	    	
	}

	@Then("Message login successfully")
	public void message_login_successfully() 
	{
	    System.out.println("Logged in successfully");
	    driver.close();
	}


}
