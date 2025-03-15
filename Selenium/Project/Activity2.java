package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
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
    public void verifyHeading() {
        // Go to the website
        driver.get("https://alchemy.hguy.co/jobs");

        // Locate the heading element
        WebElement headingElement = driver.findElement(By.xpath("//h1"));

        // Get the text of the heading
        String actualHeading = headingElement.getText();

        // Expected heading text
        String expectedHeading = "Alchemy Jobs";

        // Verify if actual title matches with the expected title
        Assert.assertEquals(actualHeading, expectedHeading, "Title does not match");

        
    }

    @AfterMethod
    public void teardown() {
        // Close the browser after the test is completed
        driver.quit();
    }
}
