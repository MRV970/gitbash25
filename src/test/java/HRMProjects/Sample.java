package HRMProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void verification() {
		
	
	WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.flipkart.com/");
	  Actions act=new Actions(driver);
	  
      driver.findElement(By.xpath("//span[text()='Grocery']")).click();
               // act.moveToElement(gr).perform();
      	 WebElement name= driver.findElement(By.xpath("//a[text()='Login']"));
      	 if(name.isDisplayed()) {
      		 System.out.println("In Grocery  Login is available");
      	 }
      	else {
   		 System.out.println("not available");
   	 }
      	  driver.navigate().back();
      	  driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
      	WebElement name1= driver.findElement(By.xpath("//a[text()='Login']"));
       	 if(name1.isDisplayed()) {
       		 System.out.println(" In Mobile  mrv is available");
       	 }
       	else {
   		 System.out.println("not available");
   	 }
       	 driver.navigate().back();
       	 driver.findElement(By.xpath("//span[text()='Appliances']")).click();
       	WebElement name2= driver.findElement(By.xpath("//a[text()='Login']"));
       	if(name2.isDisplayed()) {
      		 System.out.println(" In Appliances  mrv is available");
      	 }
       	driver.navigate().back();
       	driver.findElement(By.xpath("//span[text()='Travel']")).click();
       	WebElement name3= driver.findElement(By.xpath("//a[text()='Login']"));
       	if(name3.isDisplayed()) {
     		 System.out.println(" In Travel  mrv is available");
     	 }
       	else {
   		 System.out.println("not available");
   	 }
       	driver.navigate().back();
       	
  WebElement fashion=     	driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
       	act.moveToElement(fashion).perform();
       driver.findElement(By.xpath("//a[text()='Men's Top Wear']")).click();
       WebElement name4= driver.findElement(By.xpath("//a[text()='Login']"));
       if(name4.isDisplayed()) {
     		 System.out.println(" In Travel  mrv is available");
     	 }
       else {
  		 System.out.println("not available");
  	 }
	}
}
