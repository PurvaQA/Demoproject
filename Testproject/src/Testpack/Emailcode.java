package Testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emailcode {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Purva Automation\\Chrome Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://accounts.google.com");
        
         //maximize the browser window
         driver.manage().window().maximize();
        
         //declare and initialize the variable to store the expected title of the webpage.
         String expectedTitle = "Sign in - Google accounts";
        
         //fetch the title of the web page and save it into a string variable
         String actualTitle = driver.getTitle();
        
         //compare the expected title of the page with the actual title of the page and print the result
         if (expectedTitle.equals(actualTitle))
         {
                System.out.println("Verification for the page title is successful. ");
         }
        else
         {
                System.out.println("Verification for the page title failed.");
         }
         
         Thread.sleep(3000);
         driver.findElement(By.id("identifierId")).clear();
         driver.findElement(By.id("identifierId")).sendKeys("TestSelenium"); 
         
         driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
        
         Thread.sleep(2000);
         driver.findElement(By.name("password")).clear();
         driver.findElement(By.name("password")).sendKeys("password@123");
        
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();        
        
         //driver.close();
         //System.out.println("Test script executed successfully.");      
         //System.exit(0);
		
         //test
	}

}
