package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Activity4 {
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
    public void verifySecondHeading() {
        // Go to the website
        driver.get("https://alchemy.hguy.co/jobs");
        
        // Locate the second heading
        WebElement secondHeading = driver.findElement(By.xpath("//h2"));
        
        // Get the text of the second heading
        String headingText = secondHeading.getText();
        
        // Verify the text matches "Quia quis non"
        Assert.assertEquals(headingText, "Quia quis non", "Heading text does not match!");
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}