package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
    @Given("the user is on the login page")
    public void openPage() {
        // Open the login page
        driver.get("https://training-support.net/webelements/login-form");
        // Assert page title
        Assertions.assertEquals("Selenium: Login Form", driver.getTitle());
    }

    @When("the user enters username and password")
    public void enterCredentials() {
        // Find username field and enter username
        driver.findElement(By.id("username")).sendKeys("admin");
        // Find password field and enter password
        driver.findElement(By.id("password")).sendKeys("password");
      //get entered values
        String enteredUsername = driver.findElement(By.id("username")).getAttribute("value");
        Assertions.assertEquals(enteredUsername, "admin");
    }

    @When("the user enters {string} and {string}")
    public void enterCredswithParam(String username, String password) {
        // Find the input fields
       driver.findElement(By.id("username")).sendKeys(username);
       driver.findElement(By.id("password")).sendKeys(password);
        
       //get entered values
       String enteredUsername = driver.findElement(By.id("username")).getAttribute("value");
       Assertions.assertEquals(enteredUsername, "admin");
    }

    @And("clicks the submit button")
    public void clickSubmit() {
        // Find the submit button and click it
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @Then("get the confirmation message and verify it")
    public void getMessage() {
        // Get the confirmation message and assert
    	String message = driver.findElement(By.tagName("h1")).getText();
    	Assertions.assertEquals("Login success!", message);
    }

    @Then("get the confirmation message and verify message as {string}")
    public void getMessageWithParam(String expectedMessage) {
    	// Get the confirmation message and assert
    	String message = driver.findElement(By.tagName("h2")).getText();
    	Assertions.assertEquals(expectedMessage, message);
        
    }
}