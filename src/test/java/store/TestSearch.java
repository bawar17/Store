package store;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSearch {

	Search start = new Search();

	@Before
	public void goToPage(){
		start.GoToPage();
	}

	
	@After
	public void closeDriver(){
		start.closeDriver();
	}
	
	@Test
	public void Search1()throws InterruptedException{
		String searchResult = start.Search1("mouse");
		
		Assert.assertEquals("Error the search for product failed", true, searchResult.contains("Mouse"));
		
	}
	
	
}
