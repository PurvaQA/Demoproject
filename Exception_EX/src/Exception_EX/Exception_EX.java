package Exception_EX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_EX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Purva Automation\\Chrome Driver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		//Thread.sleep(2000);
		//driver.close();		
		 int d = 0;
		 int n = 20;
		 try {
		   int fraction = n / d;
		   System.out.println("In the try block showing Fraction =   " + fraction);
		  } catch (ArithmeticException e) {
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
	}

}
