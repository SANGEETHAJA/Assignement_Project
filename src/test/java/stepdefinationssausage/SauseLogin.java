package stepdefinationssausage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauseLogin 
{
	WebDriver driver=Hooks1.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() 
	{
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username and passowrd")
	public void i_enter_the_correct_username_and_passowrd()
	{
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
	}

	@When("I click on the LOGIN Button")
	public void i_click_on_the_LOGIN_Button() 
	{
		WebElement Button=driver.findElement(By.id("login-button"));
		Button.click();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() 
	{
    
	}

	@When("I enter the incorrect username and passowrd")
	public void i_enter_the_incorrect_username_and_passowrd()
	{
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_usersss");
		
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("secret_saucesss");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError)
	{
		
		WebElement Error= driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActualError= Error.getText();
		Assert.assertEquals(ExpError, ActualError);		
	}
}



