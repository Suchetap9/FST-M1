package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
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
    public void printHeaderImageUrl() {
        // Navigate to the website
        driver.get("https://alchemy.hguy.co/jobs");
        
        // Locate the header image
        WebElement headerImage = driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
        
        // Get the image URL
        String imageUrl = headerImage.getAttribute("src");
        
        // Print the URL to the console
        System.out.println("Header Image URL: " + imageUrl);
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
