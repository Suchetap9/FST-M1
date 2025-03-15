package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
	// Declare the class object
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
    //Driver initialization
        driver = new FirefoxDriver();
        
        //Open firefox browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }
    @Test
    public void loginToAdminPanel() throws InterruptedException {
        // Navigate to the admin login page
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        
        // Find the username field and enter 'root'
        driver.findElement(By.id("user_login")).sendKeys("root");
        
        // Find the password field and enter 'pa$$w0rd'
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        
        // Find and click the login button
        driver.findElement(By.id("wp-submit")).click();
        
        // Wait for login process to complete
        Thread.sleep(3000);
        
        // Verify login by checking if dashboard is displayed
        WebElement dashboard = driver.findElement(By.id("wpadminbar"));
        Assert.assertTrue(dashboard.isDisplayed(), "Login failed!");
        
     // Locate and click on 'Job Listings' menu item
        WebElement jobListingsMenu = driver.findElement(By.linkText("Job Listings"));
        jobListingsMenu.click();
        
        // Click 'Add New' button
        WebElement addNewButton = driver.findElement(By.linkText("Add New"));
        addNewButton.click();
        
        // Fill in the job details
        driver.findElement(By.id("post-title-0")).sendKeys("QA");
        driver.findElement(By.id("_job_location")).sendKeys("Bangalore");
        driver.findElement(By.id("_company_website")).sendKeys("https://alchemy.hguy.co");
        driver.findElement(By.id("_company_tagline")).sendKeys("");
        driver.findElement(By.id("_company_twitter")).sendKeys("@Alchemyjobs");
        
        // Click 'Publish' button
        WebElement publishButton = driver.findElement(By.xpath("//button[text()='Publish']"));
        publishButton.click();
        
        // Wait for job to be published
        Thread.sleep(3000);
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

    