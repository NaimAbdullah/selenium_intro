package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_Locator_tagName {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement heading1 = driver.findElement(By.tagName("h1"));

        if(heading1.isDisplayed()) System.out.println("Heading validation PASSED");
        else System.out.println("Heading validation FAILED");

        if(driver.findElement(By.className("central-featured-logo")).isDisplayed()) System.out.println("Logo validation PASSED");
        else System.out.println("Logo validation FAILED");

        if(driver.findElement(By.id("searchInput")).isDisplayed()) System.out.println("Search box validation PASSED");
        else System.out.println("Search box validation FAILED");

        if(driver.findElement(By.className("pure-button")).isDisplayed())
            System.out.println("Button validation PASSED");
        else System.out.println("Button validation FAILED");

        Driver.quitDriver();


    }
}
