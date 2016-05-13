package store;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search {
	WebDriver driver = new FirefoxDriver();


	public void GoToPage(){
		driver.get("http://store.demoqa.com");
	}

	public void closeDriver(){
		driver.close();

	}

	public void Search1() throws InterruptedException {


		String prodName = "mouse";
		driver.findElement(By.name("s")).clear();
		driver.findElement(By.name("s")).sendKeys(prodName);
		driver.findElement(By.name("s")).sendKeys(Keys.RETURN);

		WebElement obj = driver.findElement(By.xpath("//*[@id='grid_view_products_page_container']/div/div/div/a/img"));

		String searchResult = obj.getAttribute("alt").toString();
		System.out.println("s : "+ searchResult);

		Assert.assertEquals("Error the search for product " +prodName + " failed", true, searchResult.contains("Mouse"));

		driver.close();
	}
}
