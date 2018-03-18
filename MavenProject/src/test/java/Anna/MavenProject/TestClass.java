package Anna.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com/");
		
		WebElement login = driver.findElement(By.id("identifierId"));
		login.sendKeys("anna.makitrenko@gmail.com");
		
		WebElement NextBtn = driver.findElement(By.xpath("//div[@id='identifierNext']"));
		NextBtn.click();
		
			
		//driver.get("https://translate.google.com");
		//Assert.assertEquals(expected, actual);		
		//driver.navigate().back();		
		//driver.quit(); 
	}

}
