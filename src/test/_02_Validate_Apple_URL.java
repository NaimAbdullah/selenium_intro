package test;

import org.openqa.selenium.WebDriver;
import utilities.Driver;


public class _02_Validate_Apple_URL {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();


        driver.get("https://www.apple.com/");

        String currentURL = "https://www.apple.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(currentURL)) System.out.println("Apple URL Validation PASSED");
        else System.out.println("Apple URL Validation FAILED");

        driver.quit();
    }
}
