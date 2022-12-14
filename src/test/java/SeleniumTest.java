import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws InterruptedException {
		
		//System.setProperty("Webdriver.chrome.driver", "C:\\SeleniumTest\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		
		 List <WebElement> col = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List <WebElement> rows = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]")); 
	        System.out.println("No of rows are : " + rows.size());
	        driver.close();
		
	}

}
