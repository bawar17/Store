package store;

import org.junit.After;
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
		start.Search1();
		
	}
	
	
}
