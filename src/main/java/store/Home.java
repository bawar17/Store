package store;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Home {
	WebDriver driver = new FirefoxDriver();

	@Before
	public void GoToPage(){
		driver.get("http://store.demoqa.com//");
	}

	public void closeDriver(){
		driver.close();
	}
	
	
	public void verifyProduct(String name){
		String productToBuy = driver.findElement(By.cssSelector(".prodtitle")).getText(); 
		Assert.assertEquals(name, productToBuy);
	}
	public void clickBuyNow(){
		driver.findElement(By.cssSelector(".buynow")).click();
	}

	public void clickSlide(){
		driver.findElement(By.cssSelector(".slide")).click();
	}

	public String getProductName(){
		return driver.findElement(By.cssSelector(".product_description>h2")).getText();
	}

	public void clickMoreInfo(){
		driver.findElement(By.linkText("More Info >")).click();
	}

	public void findSlideAndLoop() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='slides']"));
		ArrayList<String> listOfSlides = new ArrayList<String>();
		String currentSlide;
		for(int i=0;i<5;i++) {
			currentSlide = driver.findElement(By.cssSelector(".product_description>h2")).getText();
			if( false == listOfSlides.contains(currentSlide) ) {
				listOfSlides.add(currentSlide);

				if( listOfSlides.size() == 3 ) {
					break;
				}
			}

			Thread.sleep(5000);
		}

		Assert.assertEquals("Error unexpected number of slides", 3, listOfSlides.size());
	}

	public void verifyManuellSlide() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='slide_menu']/a[2]")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"iPhone 5");
		driver.findElement(By.xpath("//*[@id='slide_menu']/a[3]")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"iPod Nano Blue");
		driver.findElement(By.xpath("//*[@id='slide_menu']/a[1]")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='slides']/div[1]/div[1]/h2")).getText(),"Magic Mouse");

	}


	public void LatestBlogPost(){
		driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[2]/img"));
		ArrayList<String> listOfSlides = new ArrayList<String>();
		String currentSlide;
		for(int i=0;i<5;i++) {
			currentSlide = driver.findElement(By.cssSelector(".product_description>h2")).getText();
			if( false == listOfSlides.contains(currentSlide) ) {
				listOfSlides.add(currentSlide);

				if( listOfSlides.size() == 4 ) {
					break;
				}
			}

		}

		Assert.assertEquals("Error unexpected number of slides", 4, listOfSlides.size());
	}

	public void latestBlogPost(){
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='footer']/section[2]/ul/li"));
		Assert.assertEquals("Error unexpected number of items", 4, list.size());

	}



	public void ProduktTitle(){

		String ProduktTitle = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[1]")).getText();
		driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[1]")).click();
		Assert.assertEquals(ProduktTitle,driver.findElement(By.xpath("//*[@id='single_product_page_container']/div/div[2]/h1")).getText());

	}
	
	public void ProduktImage(){

		String ProImage = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[2]/img")).getText();
		driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[2]/img")).click();
		Assert.assertEquals(ProImage,driver.findElement(By.xpath("//*[@id='single_product_page_container']/div[1]/div[1]/a/img[1]")).getText());

	}
	
	public void MoreDetails() throws InterruptedException{

		String MoreDetail1 = driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[1]")).getAttribute("title");
		driver.findElement(By.xpath("//*[@id='footer']/section[2]/ul/li[1]/a[3]")).click();
		Thread.sleep(1000);
		String ExpectedDetails= driver.findElement(By.xpath("//*[@id='single_product_page_container']/div[1]/div[2]/h1")).getText();
	
		Assert.assertEquals(MoreDetail1,ExpectedDetails);

	}

}