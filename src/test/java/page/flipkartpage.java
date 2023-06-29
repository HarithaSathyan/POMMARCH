package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class flipkartpage {
WebDriver driver;
By search=By.name("q");
By prdct=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div/div/div/section/div[4]/div[2]/a[1]");
By tshirt=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a/div[1]/div/div/div/img");
By cart=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button/svg");

public flipkartpage(WebDriver driver)
{
	this.driver=driver;
}
public void setvalue(String thing)
{
	driver.findElement(search).click();
	driver.findElement(search).sendKeys(thing,Keys.ENTER);
}
public void prdct()
{
	driver.findElement(prdct).click();
}
public void tshirt()
{
	driver.findElement(tshirt).click();
}
public void cart()
{
	driver.findElement(cart).click();
}
}
