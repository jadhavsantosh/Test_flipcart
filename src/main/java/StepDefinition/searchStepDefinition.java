package StepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;
import junit.framework.Assert;

public class searchStepDefinition {
	WebDriver driver;

	@Given("^user is already on search page$")
	public void user_is_already_on_search_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pratmesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/search?");
		driver.manage().window().maximize();
	}

	@When("^user title of page is Flipcart$")
	public void user_title_of_page_is_Flipcart() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("All Categories - Buy Products Online at Best Price in India - All Categories | Flipkart.com", title);

	}

	@Then("^user enters \"(.*)\"$")
	public void user_enters_iphoneName(String iphone) {

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(iphone);
		driver.manage().timeouts().pageLoadTimeout(30, java.util.concurrent.TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("^user clicks on price button$")
	public void user_clicks_on_price_button() {
		WebElement min = driver.findElement(By.xpath("(//select[@class='fPjUPw'])[1]"));
		Select s = new Select(min);
		s.selectByValue("Min");

		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

		WebElement max = driver.findElement(By.xpath("(//select[@class='fPjUPw'])[2]"));
		Select m=new Select(max);
		m.selectByValue("30000");
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();

	}

}
