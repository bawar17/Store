package store;

import org.junit.*;


public class TestPro {

	Produkter start = new Produkter();

	@Before
	public void goToPage(){
		start.GoToPage();
	}


	@After
	public void closeDriver(){
		start.closeDriver();
	}

	@Test 
	public void verifyProdukt(){
		start.verifyProdukt();
	}

	@Test 
	public void ProText(){
		start.ProText();
	}
	@Test 
	public void ProPrise(){
		start.ProPrise();
	}

	@Test 
	public void AddToCart() throws InterruptedException{
		int count2 = start.AddToCart();
		Assert.assertEquals("Error unexpected number of items in the cart", 1, count2);
		
	}





}