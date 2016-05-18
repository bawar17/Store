package store;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestHome {

	Home start = new Home();

	@Before
	public void goToPage(){
		start.GoToPage();
	}

	@Test
	public void VerifyBuyNowGoesToProduct(){
		String product = start.getProductName();
		start.clickBuyNow();
		start.verifyProduct(product);
	}
	@Test
	public void VerifyImg(){
		String product = start.getProductName();
		start.clickSlide();
		start.verifyProduct(product);
	}

	@Test
	public void VerifyMoreInfoGoesToProduct(){
		String product = start.getProductName();
		start.clickMoreInfo();
		start.verifyProduct(product);
	}

	@Test
	public void VerifySlideFunction() throws InterruptedException{
		int listOfSlides = start.findSlideAndLoop();
		Assert.assertEquals("Error unexpected number of slides", 3, listOfSlides);

	}


	@Test
	public void verifyManuellSlide() throws InterruptedException {
		start.verifyManuellSlide();
	}


	@Test
	public void latestBlogPost(){
		int latestBlog =start.latestBlogPost();
		Assert.assertEquals("Error unexpected number of items", 4, latestBlog);
	}

	@Test
	public void ProduktTitle(){

		Assert.assertEquals( start.LatestBlogProduktTitle(),start.ProduktTitle() );



	}
	@Test
	public void ProduktImage(){
		Assert.assertEquals( start.LatestBlogProduktTitle(), start.ProduktImage() );
	}

	@Test
	public void MoreDetails()throws InterruptedException{
		Assert.assertEquals( start.LatestBlogProduktTitle(), start.MoreDetails() );
	}


	@After
	public void closeDriver(){
		start.closeDriver();
	}
}