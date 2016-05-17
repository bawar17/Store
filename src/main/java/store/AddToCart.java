package store;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	WebDriver driver = new FirefoxDriver();

	public void GoToPage(){
		driver.get("http://store.demoqa.com");
	}

	public void closeDriver(){
		driver.close();

	}


	public void AddToCart1() throws InterruptedException {


		driver.findElement(By.cssSelector(".slide")).click();

		String selectedProdName = driver.findElement(By.className("prodtitle")).getText();
//		System.out.println("Selected Product Title"+selectedProdName);

		driver.findElement(By.className("wpsc_buy_button")).click();
		TimeUnit.MILLISECONDS.sleep(2000);
		String actualProdTitle = driver.findElement(By.xpath("//*[@id='fancy_notification_content']/span")).getText();
//		System.out.println("Actual Product Title"+actualProdTitle);

		Assert.assertEquals("Error product title in the pop up is not the same" , true, actualProdTitle.contains(selectedProdName));
	}

	
	
	
	public void GoToChekOut() throws InterruptedException {
		driver.findElement(By.cssSelector(".slide")).click();
		  driver.findElement(By.className("wpsc_buy_button")).click();
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fancy_notification_content']/a[1]")));
		  wait.pollingEvery(100, TimeUnit.MILLISECONDS);
		  driver.findElement(By.xpath("//*[@id='fancy_notification_content']/a[1]")).click();
		  
		  TimeUnit.MILLISECONDS.sleep(5000);
		  
		  Assert.assertTrue("Error the checkout button does not work!", driver.getTitle().contains("Checkout"));
		  
	}
	
	
	
	public void ContinueShopping() throws InterruptedException{
		
		driver.findElement(By.cssSelector(".slide")).click();
		  
		  String selectedProdName = driver.findElement(By.className("prodtitle")).getText();
		  driver.findElement(By.className("wpsc_buy_button")).click();
		  TimeUnit.MILLISECONDS.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id='fancy_notification_content']/a[2]")).click();
		  TimeUnit.MILLISECONDS.sleep(5000);
		  
		  Assert.assertTrue("Error the Continue Shopping button does not work!", driver.getTitle().contains(selectedProdName));
		  
		  
		  
	}
}
