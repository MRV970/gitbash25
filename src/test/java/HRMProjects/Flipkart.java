package HRMProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
          @Test
          public void checkingname() throws InterruptedException {
        	  WebDriver driver=new ChromeDriver();
        	  driver.manage().window().maximize();
        	  
        	  driver.get("https://www.flipkart.com/");
        	  driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();
        	  driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9951403191");
        	  driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
        	  
        	  //driver.findElement(By.xpath("//button[@class='QqFHMw llMuju M5XAsp']")).click();
        	  Actions act=new Actions(driver);
        	  
        driver.findElement(By.xpath("//span[text()='Grocery']")).click();
                  
        	 WebElement name= driver.findElement(By.xpath("//div[text()='mrv']"));
        	 if(name.isDisplayed()) {
        		 System.out.println("In Grocery  mrv is available");
        	 }
        	 else {
        		 System.out.println("not available");
        	 }
        	  driver.navigate().back();
        	  driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
        	 // WebElement name= driver.findElement(By.xpath("//div[text()='My Account']"));
         	 if(name.isDisplayed()) {
         		 System.out.println(" In Mobile  mrv is available");
         	 }
         	else {
       		 System.out.println("not available");
       	 }
         	 driver.navigate().back();
         	 driver.findElement(By.xpath("//span[text()='Appliances']")).click();
         	if(name.isDisplayed()) {
        		 System.out.println(" In Appliances  mrv is available");
        	 }
         	else {
       		 System.out.println("not available");
       	 }
         	driver.navigate().back();
         	driver.findElement(By.xpath("//span[text()='Travel']")).click();
         	if(name.isDisplayed()) {
       		 System.out.println(" In Travel  mrv is available");
       	 }
         	else {
       		 System.out.println("not available");
       	 }
         	driver.navigate().back();
         	
    WebElement fashion=     	driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
         	act.moveToElement(fashion).perform();
         driver.findElement(By.xpath("//a[text()='Men's Top Wear']")).click();
         if(name.isDisplayed()) {
       		 System.out.println(" In Travel  mrv is available");
       	 }
         else {
    		 System.out.println("not available");
    	 }
         driver.navigate().back();
         driver.findElement(By.xpath("//div[text()='Noise Smartwatches']")).click();
         if(name.isDisplayed()) {
       		 System.out.println(" In Travel  mrv is available");
       	 }
         else {
    		 System.out.println("not available");
    	 }
         driver.navigate().back();
          }
}
