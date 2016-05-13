package store;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductCategory {
	WebDriver driver = new FirefoxDriver();


	public void GoToPage(){
		driver.get("http://store.demoqa.com");
	}

	public void closeDriver(){
		driver.close();
	}
	
	public void DropDownList()throws InterruptedException{
		Actions actions = new Actions(driver);
		WebElement Drop = driver.findElement(By.id("menu-item-33"));
		actions.moveToElement(Drop).perform();
		Thread.sleep(500);
		WebElement accessories = driver.findElement(By.xpath("//*[@id='menu-item-34']/a"));
		Thread.sleep(500);
		accessories.click();
		Assert.assertEquals("Error","Accessories | ONLINE STORE",  driver.getTitle());
		Thread.sleep(500);
		
		Actions actions1 = new Actions(driver);
		WebElement Drop2 = driver.findElement(By.id("menu-item-33"));
		actions1.moveToElement(Drop2).perform();
		Thread.sleep(500);
		WebElement iMacs = driver.findElement(By.xpath("//*[@id='menu-item-35']/a"));
		Thread.sleep(500);
		iMacs.click();
		Assert.assertEquals("Error","iMacs | ONLINE STORE",  driver.getTitle());
		
		
		Actions actions2 = new Actions(driver);
		WebElement Drop3 = driver.findElement(By.id("menu-item-33"));
		actions2.moveToElement(Drop3).perform();
		Thread.sleep(500);
		WebElement iPads = driver.findElement(By.xpath("//*[@id='menu-item-36']/a"));
		Thread.sleep(500);
		iPads.click();
		Assert.assertEquals("Error","iPads | ONLINE STORE",  driver.getTitle());
		
		
		

		Actions actions3 = new Actions(driver);
		WebElement Drop4 = driver.findElement(By.id("menu-item-33"));
		actions3.moveToElement(Drop4).perform();
		Thread.sleep(500);
		WebElement iPhones = driver.findElement(By.xpath("//*[@id='menu-item-37']/a"));
		Thread.sleep(500);
		iPhones.click();
		Assert.assertEquals("Error","iPhones | ONLINE STORE",  driver.getTitle());
		
		
		
		Actions actions4 = new Actions(driver);
		WebElement Drop5 = driver.findElement(By.id("menu-item-33"));
		actions4.moveToElement(Drop5).perform();
		Thread.sleep(500);
		WebElement iPods = driver.findElement(By.xpath("//*[@id='menu-item-38']/a"));
		Thread.sleep(500);
		iPods.click();
		Assert.assertEquals("Error","iPods | ONLINE STORE",  driver.getTitle());
		
		
		

		Actions actions5 = new Actions(driver);
		WebElement Drop6 = driver.findElement(By.id("menu-item-33"));
		actions5.moveToElement(Drop6).perform();
		Thread.sleep(500);
		WebElement MacBooks = driver.findElement(By.xpath("//*[@id='menu-item-39']/a"));
		Thread.sleep(500);
		MacBooks.click();
		Assert.assertEquals("Error","MacBooks | ONLINE STORE",  driver.getTitle());
		
		
		
		
	}
	
	
	

}
