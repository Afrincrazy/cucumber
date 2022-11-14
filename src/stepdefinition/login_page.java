package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_page {
	WebDriver driver;
	@Given("^user is in the FACEBOOK page$")
	public void user_is_in_the_FACEBOOK_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com/");
	}

	@When("^user enters USER ID as \"([^\"]*)\"$")
	public void user_enters_USER_ID_as(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("afrinsafa7865");
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234");
	}

	@Then("^user should be navigated to login page$")
	public void user_should_be_navigated_to_login_page() throws Throwable {
	   driver.findElement(By.xpath("\"//*[@id=\"u_0_5_t9\"]\"")).click();
	}

}
