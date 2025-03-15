package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
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
    public void verifyWebsiteTitle() {
        // Go to the website
        driver.get("https://alchemy.hguy.co/jobs");

        // Get title of the website
        String actualTitle = driver.getTitle();

        // Expected title
        String expectedTitle = "Alchemy Jobs – Job Board Application";

        // Verify if actual title matches with the expected title
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");

        
    }

    @AfterMethod
    public void teardown() {
        // Close the browser after the test is completed
        driver.quit();
    }
}
