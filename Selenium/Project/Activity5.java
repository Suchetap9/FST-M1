package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Activity5 {
    // Declare the class object
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
    //Driver initialization
        driver = new FirefoxDriver();
        
        //Open firefox browser
        driver.get("https://alchemy.hguy.co/jobs");
    }
    @Test
    public void GoToJobsPageAndVerifyTitle() {
        // Go to the website
        driver.get("https://alchemy.hguy.co/jobs");
        
        // Find the navigation bar and click on 'Jobs' menu item
        WebElement jobsMenu = driver.findElement(By.linkText("Jobs"));
        jobsMenu.click();
        
        // Verify you are the on the correct page
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Jobs – Alchemy Jobs", "Page title does not match!");
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}