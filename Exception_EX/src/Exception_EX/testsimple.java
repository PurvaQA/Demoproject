package Exception_EX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Purva Automation\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.close();
	}
	
}