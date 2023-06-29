package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.flipkartpage;

public class Flipkarttest {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
	}
	@Test
	public void set()
	{
		flipkartpage fk=new flipkartpage(driver);
			fk.setvalue("tshirt");
			fk.prdct();
			fk.tshirt();
			fk.cart();
				
	}

}
