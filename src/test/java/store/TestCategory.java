package store;

import org.junit.*;

public class TestCategory {

	ProductCategory start = new ProductCategory();

	@Before
	public void goToPage(){
		start.GoToPage();
	}


	@After
	public void closeDriver(){
		start.closeDriver();
	}

	@Test
	public void Category()throws InterruptedException{
		start.DropDownList();

	}



}
