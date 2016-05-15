package store;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;






public class CheckOut{
	
		WebDriver driver = new ChromeDriver();

	public void goToPage(){
	
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		driver.get("http://store.demoqa.com/");
	}

	public void closeDriver(){
		driver.close();
	}

	public void Text(){

		driver.findElement(By.className("cart_icon")).click();
		String empty = driver.findElement(By.className("entry-content")).getText();
		Assert.assertEquals("Error: Cart is not empty","Oops, there is nothing in your cart." , empty);

	}


	public void Remove() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")).click();
		String empty = driver.findElement(By.className("entry-content")).getText();
		Assert.assertEquals("Error: Cart is not empty","Oops, there is nothing in your cart." , empty);
	}

	public void UppdateQ() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")).click();
		String price = driver.findElement(By.className("pricedisplay")).getText();
		Assert.assertEquals("Error unexpected price","$1,500.00", price); 
	}

	public void RemovePro() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")).sendKeys(Keys.BACK_SPACE, "0");
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")).click();
		String empty = driver.findElement(By.className("entry-content")).getText();
		Assert.assertEquals("Error: Cart is not empty","Oops, there is nothing in your cart." , empty);
	}


	public void YourCart() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(3000);
		String headerColor = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[1]")).getCssValue("color");
		Assert.assertEquals("some message", "rgba(0, 0, 0, 1)", headerColor);


	}
}