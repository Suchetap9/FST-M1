package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
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
    public void searchAndApplyForJob() throws InterruptedException {
        // Navigate to the website
        driver.get("https://alchemy.hguy.co/jobs");
        
        // Find the navigation bar and click on 'Jobs' menu item
        WebElement jobsMenu = driver.findElement(By.linkText("Jobs"));
        jobsMenu.click();
        
        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_keywords")));
        
        // Search for 'Banking' job
        WebElement searchBox = driver.findElement(By.id("search_keywords"));
        searchBox.sendKeys("Banking");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        
        // Wait for job listings to appear
        Thread.sleep(3000);
        
     // Locate 'Testjob' job in the list and click it
        WebElement jobListing = driver.findElement(By.partialLinkText("Testjob"));
        jobListing.click();
        
        // Wait for the job details page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("application_button")));
        
        // Click 'Apply for job' button
        WebElement applyButton = driver.findElement(By.className("application_button"));
        applyButton.click();
        
        // Wait for application details to show
        Thread.sleep(3000);
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}  