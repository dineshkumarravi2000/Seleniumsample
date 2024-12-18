package seleniumlear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.*;


public class SeleniumLearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://extranet.telent.com/CtSoloUIStaging/index.aspx");
		driver.findElement(By.xpath("//html/body/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("ram.prasad@telentbee.co.uk");
		driver.findElement(By.id("Password")).sendKeys("Cptpram!1");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("LoginButton")).click();
	    Thread.sleep(20000);
	    driver.findElement(By.id("orderNumber")).sendKeys("327789564");
	    Thread.sleep(10000);
	    driver.getTitle();
	    System.out.println(driver.getTitle());
	    driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.id("ctl00_SignOutLink")).click();
	    Thread.sleep(10000);
	    driver.close();
	    
	    

	}

}
