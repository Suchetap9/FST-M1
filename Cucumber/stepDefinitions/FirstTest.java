package stepDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest extends BaseClass{
	@Given("user is on TS homepage")
	public void openPage() {
		driver.get("https://training-support.net");
		
		assertEquals(driver.getTitle(), "Training Support");
	}
	
    @When("they click on About Us link")
    public void clickLink() {
    	driver.findElement(By.linkText("About Us")).click();
    }
    
    @Then("they are redirected to the About page")
    public void redirectToAbout() {
    	assertEquals(driver.getTitle(), "About Training Support");
    }
    
    
}
