package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchstepDef {

	WebDriver driver;
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
	   
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@When("User enters Java Tutorial")
	public void user_enters_java_tutorial() {
	   
		WebElement searchbox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchbox.sendKeys("Java Tutorial"); 
			searchbox.submit();
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	   
	}


	@When("User enters Selenium Tutorial")
	public void user_enters_Selenium_tutorial() {
	   
		WebElement searchbox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchbox.sendKeys("Selenium Tutorial"); 
			searchbox.submit();
	}
	@Then("Should display Selenium result page")
	public void should_display_Selenium_result_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	   
	}
	
	/*@After
	public void generateScreenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			TakesScreenshot screen=(TakesScreenshot)driver;
			File file=screen.getScreenshotAs(OutputType.FILE);
			byte[] imgByte=FileUtils.readFileToByteArray(file);
			scenario.attach(imgByte,"image/png","image1");
		}
	*		*/	
		
	}

	
	
