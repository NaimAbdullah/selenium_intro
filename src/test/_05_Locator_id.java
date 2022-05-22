package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    /*
        Go to https://www.techglobalschool.com

        Validate the company signature
            Logo must be displayed in the header section
            Company name must be displayed in the header section
            Company quote must be displayed in the header section
         */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));

        if(logo.isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        WebElement companyName = driver.findElement(By.id("comp-kuiqjidf"));

        if(companyName.isDisplayed() && companyName.getText().equals("TechGlobal")) System.out.println("Company name validation PASSED");
        else System.out.println("Company name validation FAILED");

        WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf1"));

        if(companyQuote.isDisplayed() && companyQuote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("Company quote validation PASSED");
        else System.out.println("Company quote validation FAILED");

        System.out.println(companyName.getText());
        System.out.println(companyQuote.getText());

        Driver.quitDriver();
    }
}
