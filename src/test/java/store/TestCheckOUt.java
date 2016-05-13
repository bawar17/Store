package store;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestCheckOUt {

	CheckOut start = new CheckOut();

	@Before
	public void goToPage(){
		start.goToPage();
	}


	@After
	public void closeDriver(){
		start.closeDriver();
	}
	
	@Test
	public void Text()throws InterruptedException{
		start.Text();
	}

	@Test
	public void Remove()throws InterruptedException{
		start.Remove();
	}
	@Test
	public void UppdateQ()throws InterruptedException{
		start.UppdateQ();
	}
	@Test
	public void RemovePro()throws InterruptedException{
		start.RemovePro();
	}
	@Test
	public void YourCart()throws InterruptedException{
		start.YourCart();
	}
	

	
	






}