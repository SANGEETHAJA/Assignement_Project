package stepdefinationssausage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;




public class HomePageProduct 
{
	WebDriver driver=Hooks1.driver;
	
	@Then("I click on ADD TO CART on a product  {string}")
	public void i_click_on_ADD_TO_CART_on_a_product(String Product)
	{
		String Xpath= "//div[text()='" + Product + "']//following::button[1]";
	    WebElement prod=driver.findElement(By.xpath(Xpath));
	    prod.click();
	}

	@Then("basket value shhould be {int}")
	public void basket_value_shhould_be(Integer int1)
	{
	    
	    WebElement Value=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
	    String CartValue=Value.getText();
	    Assert.assertEquals(CartValue, "1");
	    
	}

	


}
