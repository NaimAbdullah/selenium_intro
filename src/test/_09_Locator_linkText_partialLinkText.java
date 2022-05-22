package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        if(aboutLink.isEnabled() && aboutLink.isDisplayed()) System.out.println("About link validation PASSED");
        else System.out.println("About link validation FAILED");

        WebElement storeLink = driver.findElement(By.linkText("Store"));
        if(storeLink.isEnabled() && storeLink.isDisplayed()) System.out.println("Store link validation PASSED");
        else System.out.println("Store link validation FAILED");

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        if(gmailLink.isEnabled() && gmailLink.isDisplayed()) System.out.println("Gmail link validation PASSED");
        else System.out.println("Gmail link validation FAILED");

        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        if(imagesLink.isEnabled() && imagesLink.isDisplayed()) System.out.println("Image link validation PASSED");
        else System.out.println("Image link validation FAILED");

        System.out.println();

        Driver.quitDriver();
    }
}
