package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	// Declare the class object
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
    //Driver initialization
        driver = new FirefoxDriver();
        
        //Open firefox browser
        driver.get("https://alchemy.hguy.co/jobs");
    }  @Test
  
  public void createJobListing() throws InterruptedException {
      // Navigate to the website
      driver.get("https://alchemy.hguy.co/jobs");
      
      // Find the navigation bar and click on 'Post a Job' menu item
      WebElement postJobMenu = driver.findElement(By.linkText("Post a Job"));
      postJobMenu.click();
      
      // Fill out the job details
       driver.findElement(By.id("create_account_email"))
             .sendKeys("suchetap9@gmail.com");
       driver.findElement(By.id("job_title"))
             .sendKeys("QA");
       driver.findElement(By.id("job_location"))
             .sendKeys("Bangalore");
       driver.findElement(By.id("job_description_ifr"))
             .sendKeys("Functional tester");
       driver.findElement(By.id("application"))
             .sendKeys("https://alchemy.hguy.co");
      driver.findElement(By.id("company_name"))
            .sendKeys("Alchemy labs");

      // Click Preview button
       WebElement previewButton = driver.findElement(By.name("submit_job"));
       previewButton.click();

     // Wait for preview page to load
       Thread.sleep(3000);

    // Click Submit Listing button
       WebElement submitButton = driver.findElement(By.id("job_preview_submit_button"));
       submitButton.click();
    }

    @AfterClass
    public void tearDown() {
    // Close the browser
    driver.quit();
    } 
    
}

