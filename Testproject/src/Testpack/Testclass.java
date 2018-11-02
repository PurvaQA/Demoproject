package Testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Purva Automation\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://www.shortroundsupplystaging.biz/"); //Open website
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul[2]/li[2]/span/a")).click(); //Click on login link
		driver.findElement(By.id("email")).sendKeys("purva@commercepundit.com"); //Enter username in field
		driver.findElement(By.id("pass")).sendKeys("purva@1234"); //Enter password in field
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click(); //Click on sign in button
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"om\"]/ul/li[2]/a/span")).click(); //Click on category link from menu
		js.executeScript("window.scrollBy(0,500)"); //scroll screen down by 500px
		driver.findElement(By.xpath("//*[@id=\"layer-product-list\"]/div[2]/ol/li[3]/div/div/div[3]/div/div[1]/form/button")).click(); //Click on the product
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Continue Shopping")).click(); //Click on continue shopping link from the popup comes after add to cart
		
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)"); //scroll screen up by 500px	
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[4]/a")).click(); //Click on header cart to open mini cart
		driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")).click(); //Click on view cart link from minicart
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"block-shipping-heading\"]")).click(); // Click on shipping estimation section to open
		
		Select state = new Select(driver.findElement(By.name("region_id"))); //Select state dropdown
		state.selectByVisibleText("California"); //Select California option from state dropdown
		
		driver.findElement(By.name("postcode")).clear(); //Clear field of zip code
		driver.findElement(By.name("postcode")).sendKeys("90001"); //Zip code field set as 90001
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)"); //Scroll down by 500 px
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li/button")).click(); //Click on proceed to checkout button

	}

}
