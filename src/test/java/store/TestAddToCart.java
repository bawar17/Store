package store;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAddToCart {

	AddToCart start = new AddToCart();

	@Before
	public void goToPage(){
		start.GoToPage();
	}


	@After
	public void closeDriver(){
		start.closeDriver();
	}

	@Test
	public void AddToCart()throws InterruptedException{
		start.AddToCart1();

	}
	
	@Test
	public void GoToChekOut() throws InterruptedException{
		start.GoToChekOut();
		
	}
	
	@Test
	public void ContinueShopping() throws InterruptedException{
		start.ContinueShopping();
	}


}
