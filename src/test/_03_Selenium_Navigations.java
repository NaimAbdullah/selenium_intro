package test;

import org.openqa.selenium.WebDriver;
import utilities.Driver;


public class _03_Selenium_Navigations {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();


        driver.get("https://www.techglobalschool.com/");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String expectedURL = "https://www.amazon.com/";

        String actualTitle = driver.getTitle();
        String actualURL = driver.getCurrentUrl();

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validated PASSED");
        else System.out.println("Title validation FAILED");

        if(actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        driver.quit();
    }
}
