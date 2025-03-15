package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
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
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

