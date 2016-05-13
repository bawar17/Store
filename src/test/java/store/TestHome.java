package store;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		start.findSlideAndLoop();
	}


	@Test
	public void verifyManuellSlide() throws InterruptedException {
		start.verifyManuellSlide();
	}


	@Test
	public void latestBlogPost(){
		start.latestBlogPost();
	}

	@Test
	public void ProduktTitle(){
		start.ProduktTitle();
	}
	@Test
	public void ProduktImage(){
		start.ProduktImage();
	}

	@Test
	public void MoreDetails()throws InterruptedException{
		start.MoreDetails();
	}


	@After
	public void closeDriver(){
		start.closeDriver();
	}
}